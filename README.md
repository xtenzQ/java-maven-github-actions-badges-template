# Maven GitHub Actions build/test/coverage badge generation workflows

A friendly reminder: If this repo somehow helped you please star 🌟 it! Thank you! 😄

### Use this Maven template to generate README.md badges using GitHub Actions

| Action | Badge | Path |
| --- | --- | --- |
| build | ![build](https://github.com/xtenzQ/java-maven-github-actions-badges-template/actions/workflows/build.yml/badge.svg?branch=main) | `https://github.com/<name>/<repo>/actions/workflows/build.yml/badge.svg?branch=main` |
| test | ![test](https://github.com/xtenzQ/java-maven-github-actions-badges-template/actions/workflows/tests.yml/badge.svg?branch=main) | `https://github.com/<name>/<repo>/actions/workflows/tests.yml/badge.svg?branch=main` |
| coverage | ![Coverage](.github/badges/jacoco.svg) | `.github/badges/jacoco.svg` |

Badge generation is based on GitHub Actions Workflows:
1. [build.yml](.github/workflows/build.yml) - is default `mvn package` building command
2. [tests.yml](.github/workflows/tests.yml) - uses `org.jacoco.jacoco-maven-plugin` to generate test coverage report. We also use this workflow to generate `tests | passing` badge.
