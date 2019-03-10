# sbt-paradox-diagrams

A simple paradox plugin, which will draw diagrams from formal definitions.


Used libs:
 - https://bramp.github.io/js-sequence-diagrams/
 - http://flowchart.js.org/
 - https://mermaidjs.github.io/
 
 
Example:
````
@@@ seqence-diagram
```raw
Andrew->China: Says Hello
Note right of China: China thinks about it
China-->Andrew: How are you?
Andrew->>China: I am good thanks!
```
@@@ 
````
will render the first example from the js-sequence website. 
Also `flowchart-diagram` and `mermaid-diagram` works. 
For more information visit the listed sites.

Install (to the `project/plugins.sbt`):
```
resolvers += "jitpack" at "https://jitpack.io"
addSbtPlugin("com.github.TeamWanari" % "sbt-paradox-diagrams" % "-SNAPSHOT")
```

 
TODO:
 - add dot and railroad, idea from: https://github.com/francoislaberge/diagrams
 - release on maven
