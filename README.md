# sbt-paradox-diagrams

A simple paradox plugin, which will draw diagrams from formal definitions.


Used libs:
 - https://bramp.github.io/js-sequence-diagrams/
 
 
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

Install:
```
resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "com.github.TeamWanari" % "sbt-paradox-diagrams" % "-SNAPSHOT"
```

 
TODO:
 - add tests
 - add flowchart http://flowchart.js.org/
 - add dot and railroad, idea from: https://github.com/francoislaberge/diagrams
 - add mermaid https://mermaidjs.github.io/
 - release on maven
