package sc.gui.view

import javafx.collections.ObservableList
import javafx.geometry.Orientation
import org.slf4j.LoggerFactory
import sc.gui.ControllingClient
import sc.gui.controller.GameController
import sc.gui.controller.NewGameState
import sc.gui.model.UndeployedPiecesModel
import sc.plugin2021.Piece
import tornadofx.*

class PiecesListFragment() : Fragment() {
    val undeployedPiecesModel: UndeployedPiecesModel by param()

    val controller: GameController by inject()

    init {
        logger.debug("pieces fragment list for ${undeployedPiecesModel.color}")
        subscribe<NewGameState> { event ->
            logger.debug("new event $event")
            val shapes = event.gameState.undeployedPieceShapes[undeployedPiecesModel.color]
            if (shapes != null) {
                undeployedPiecesModel.update(shapes.toSet())
            } else {
                logger.error("got NewGameState event but gameState was null!")
            }
        }
    }

    override val root = flowpane {
        hgap = 4.0
        vgap = 4.0

        // fill column by column and not row by row
        orientation = Orientation.VERTICAL

        children.bind(undeployedPiecesModel.undeployedPieces) {
            hbox {
                add(PiecesFragment(undeployedPiecesModel.color, it))
            }
        }
    }

    override fun onDock() {
        super.onDock()
        logger.debug("$this is docked")
    }

    override fun onUndock() {
        super.onUndock()
        logger.debug("$this is UNdocked")
    }

    companion object {
        private val logger = LoggerFactory.getLogger(PiecesListFragment::class.java)
    }
}
