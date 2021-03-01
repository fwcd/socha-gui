# Changelog
All notable changes to this project will be documented in this file.
The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0),

See [the changelog of the backend](https://github.com/CAU-Kiel-Tech-Inf/backend/blob/master/CHANGELOG.md)
for details on our versioning scheme.

## [Unreleased]

## [21.3.0](https://github.com/CAU-Kiel-Tech-Inf/gui/commits/21.3.0) - 2021-01-29
- Unify skip and pass button ([#63](https://github.com/CAU-Kiel-Tech-Inf/gui/pull/63))
- Improve in-game status display ([#61](https://github.com/CAU-Kiel-Tech-Inf/gui/pull/61))
- Remove accidental disabling of an entire menubar item before a game is started ([610d722e1f5a6056ebfcdf2ec4a56ed349fd5ba0](https://github.com/CAU-Kiel-Tech-Inf/gui/commit/610d722e1f5a6056ebfcdf2ec4a56ed349fd5ba0))
- Improve some internal algorithms

## [21.2.1](https://github.com/CAU-Kiel-Tech-Inf/gui/commits/21.2.1) - 2020-12-18
- Cancel an existing game when starting a new one
- Make in-game status display a little more concise

## [21.2.0](https://github.com/CAU-Kiel-Tech-Inf/gui/commits/21.2.0) - 2020-12-14
- Implement support for manually started clients
- Add loading view when game is starting
- Show winner info on game end (#58)
- Highlight shapes that can currently be placed (#55)
- Improve internal verification & publishing mechanisms

## 21 - Game Blokus
Replaced [Electron GUI](https://github.com/CAU-Kiel-Tech-Inf/gui-electron) with new GUI based on [TornadoFX](https://github.com/edvin/tornadofx2)