# sbt-paradox-diagrams

[![Build Status](https://travis-ci.org/TeamWanari/sbt-paradox-diagrams.svg?branch=master)](https://travis-ci.org/TeamWanari/sbt-paradox-diagrams)
[![Latest version](https://index.scala-lang.org/TeamWanari/sbt-paradox-diagrams/sbt-paradox-diagrams/latest.svg)](https://index.scala-lang.org/TeamWanari/sbt-paradox-diagrams)
[![Documentation](https://img.shields.io/badge/-Documatation-blue)](https://teamwanari.github.io/sbt-paradox-diagrams)
[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)
[![Mergify Status](https://img.shields.io/endpoint.svg?url=https://gh.mergify.io/badges/TeamWanari/tutelar&style=flat)](https://mergify.io)


A simple paradox plugin, which will draw diagrams from formal definitions.

## Supported Diagram Types
 - Sequence Diagrams (via https://bramp.github.io/js-sequence-diagrams)
 - FlowCharts (via http://flowchart.js.org)
 - Gantt and others (via https://mermaidjs.github.io)

## Setup

Add the following lines to your `project/plugins.sbt`:
```
addSbtPlugin("com.wanari" % "sbt-paradox-diagrams" % "<current-version>")
```
 
## Example
````
@@@ sequence-diagram
```raw
Andrew->China: Says Hello
Note right of China: China thinks about it
China-->Andrew: How are you?
Andrew->>China: I am good thanks!
```
@@@ 
````

see the [docs](docs) for more examples.
