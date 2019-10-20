# sbt-paradox-diagrams

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
