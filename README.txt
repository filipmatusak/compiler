Kompilácia 

Build kompilátora: 

mvn dependency:resolve
mvn scala:compile
mvn package

vytvorí sa target/compiler.jar

Použitie kompilátora

java -jar compiler.jar main.x main.ll
llvm-as main.ll

Spustenie programu

lli -load=./library.so main.bc