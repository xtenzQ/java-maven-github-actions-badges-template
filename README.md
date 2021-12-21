# Maven GitHub Actions build/test/coverage badge generation workflows

A friendly reminder: If this repo somehow helped you please star 🌟 it! Thank you! 😄

### Use this template for your README.md to generate badges

| Action | Badge | Path |
| --- | --- | --- |
| build | ![build](https://github.com/xtenzQ/java-maven-github-actions-badges-template/actions/workflows/build.yml/badge.svg) | `https://github.com/<name>/<repo>/actions/workflows/build.yml/badge.svg` |
| test | ![test](https://github.com/xtenzQ/java-maven-github-actions-badges-template/actions/workflows/tests.yml/badge.svg) | `https://github.com/<name>/<repo>/actions/workflows/tests.yml/badge.svg` |
| coverage | ![Coverage](.github/badges/jacoco.svg) | `.github/badges/jacoco.svg` |

Badge generation is based on GitHub Actions Workflows:
1. [build.yml](.github/workflows/build.yml) - is default `mvn package` building command
2. [tests.yml](.github/workflows/tests.yml) - uses `org.jacoco.jacoco-maven-plugin` to generate test coverage report. We also use this workflow to generate `tests | passing` badge.