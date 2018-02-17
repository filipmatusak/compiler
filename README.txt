# Compiler for simple scala-like language using llvm

This projec was created for course Compilers on Comenius University in 2017.

See examples/

## Build compiler

mvn dependency:resolve
mvn scala:compile
mvn package

This creates target/compiler.jar

## Using compiler

java -jar compiler.jar main.x main.ll
llvm-as main.ll

## Run

lli -load=./library.so main.bc