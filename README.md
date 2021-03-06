# MiniJava Language JavaCC Compiler

### Federal University of Ceara, Department of Computing, Course of Compiler Construction.

## Members:
  - Gustavo Sousa
  - Evilásio Costa
  - José de Assis
  - Leyberson Assunção

---

## Prerequisites:

You need [Java](https://www.oracle.com/java/technologies/javase-downloads.html) and [JavaCC](https://javacc.github.io/javacc/) installed. Check the course book [here](https://www.cambridge.org/core/books/modern-compiler-implementation-in-java/34EACED718B1D6D5237705F9BFD7CD4A).

---

## Phases:
### 1. [Lexycal Analyser and Parser Phase](src/Lexycal_analyser/)

Build a lexycal analyser and parser for the grammar specified in the course book.

#### Status: Lexycal_Analyzer is done!

#### Instructions:
```sh
$ cd src/Lexycal_Analyzer
$ javacc Parser.jj
$ javac *.java
$ java Parser ../test_files/minijava.java 
```

#### Check the [grammar documentation](src/Lexycal_analyser/Parser.txt) with the comand:
```sh
$ jjdoc -TEXT Parser.jj
```

