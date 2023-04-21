[33mcommit c010ccb7cf04dfb80f0ca120916d326a2532ec7b[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m)[m
Author: Maciej Minorowski <minorus@o2.pl>
Date:   Fri Apr 21 18:59:30 2023 +0200

    Commit 1

 .../SDA_Java_podstawy_PL.zip                       |  Bin [31m0[m -> [32m23486[m bytes
 .../course.json                                    | 2386 [32m++++++++++++++++++++[m
 .../.idea/.gitignore                               |    0
 ...stawy programowanie - zadania z prezentacji.iml |    9 [32m+[m
 .../.idea/compiler.xml                             |   16 [32m+[m
 .../.idea/encodings.xml                            |    7 [32m+[m
 .../.idea/jarRepositories.xml                      |   20 [32m+[m
 .../.idea/misc.xml                                 |   11 [32m+[m
 .../.idea/modules.xml                              |    9 [32m+[m
 .../.idea/workspace.xml                            |  151 [32m++[m
 .../.idea/.gitignore                               |    3 [32m+[m
 .../.idea/compiler.xml                             |   13 [32m+[m
 .../.idea/encodings.xml                            |    7 [32m+[m
 .../.idea/jarRepositories.xml                      |   20 [32m+[m
 .../.idea/misc.xml                                 |   14 [32m+[m
 .../JavaPodstawyProgramowaniaZadZPrez.iml          |   15 [32m+[m
 .../JavaPodstawyProgramowaniaZadZPrez/pom.xml      |   17 [32m+[m
 .../src/main/java/Zad1/Main.java                   |   16 [32m+[m
 .../src/main/java/Zad10/Main.java                  |   25 [32m+[m
 .../src/main/java/Zad11/Main.java                  |   26 [32m+[m
 .../src/main/java/Zad12/Main.java                  |   25 [32m+[m
 .../src/main/java/Zad13/Main.java                  |   25 [32m+[m
 .../src/main/java/Zad14/Main.java                  |   23 [32m+[m
 .../src/main/java/Zad15/Main.java                  |   36 [32m+[m
 .../src/main/java/Zad16/Main.java                  |   34 [32m+[m
 .../src/main/java/Zad17/Main.java                  |   32 [32m+[m
 .../src/main/java/Zad18/Main.java                  |   29 [32m+[m
 .../src/main/java/Zad19/Main.java                  |  102 [32m+[m
 .../src/main/java/Zad2/Main.java                   |   22 [32m+[m
 .../src/main/java/Zad20/GuessResult.java           |   28 [32m+[m
 .../src/main/java/Zad20/Main.java                  |  149 [32m++[m
 .../src/main/java/Zad3/Main.java                   |   35 [32m+[m
 .../src/main/java/Zad4/Main.java                   |   26 [32m+[m
 .../src/main/java/Zad5/Main.java                   |   30 [32m+[m
 .../src/main/java/Zad6/Main.java                   |   20 [32m+[m
 .../src/main/java/Zad7/Main.java                   |   36 [32m+[m
 .../src/main/java/Zad8/Main.java                   |   85 [32m+[m
 .../src/main/java/Zad9/Main.java                   |   36 [32m+[m
 .../target/classes/Zad1/Main.class                 |  Bin [31m0[m -> [32m876[m bytes
 .../target/classes/Zad10/Main.class                |  Bin [31m0[m -> [32m1372[m bytes
 .../target/classes/Zad11/Main.class                |  Bin [31m0[m -> [32m1626[m bytes
 .../target/classes/Zad12/Main.class                |  Bin [31m0[m -> [32m1598[m bytes
 .../target/classes/Zad13/Main.class                |  Bin [31m0[m -> [32m1847[m bytes
 .../target/classes/Zad14/Main.class                |  Bin [31m0[m -> [32m1474[m bytes
 .../target/classes/Zad15/Main.class                |  Bin [31m0[m -> [32m1437[m bytes
 .../target/classes/Zad16/Main.class                |  Bin [31m0[m -> [32m1504[m bytes
 .../target/classes/Zad17/Main.class                |  Bin [31m0[m -> [32m2405[m bytes
 .../target/classes/Zad18/Main.class                |  Bin [31m0[m -> [32m1156[m bytes
 .../target/classes/Zad19/Author.class              |  Bin [31m0[m -> [32m864[m bytes
 .../target/classes/Zad19/Main.class                |  Bin [31m0[m -> [32m2102[m bytes
 .../target/classes/Zad19/Poem.class                |  Bin [31m0[m -> [32m853[m bytes
 .../target/classes/Zad2/Main.class                 |  Bin [31m0[m -> [32m1599[m bytes
 .../target/classes/Zad20/GuessResult.class         |  Bin [31m0[m -> [32m1697[m bytes
 .../target/classes/Zad20/Main.class                |  Bin [31m0[m -> [32m3322[m bytes
 .../target/classes/Zad3/Main.class                 |  Bin [31m0[m -> [32m1783[m bytes
 .../target/classes/Zad4/Main.class                 |  Bin [31m0[m -> [32m971[m bytes
 .../target/classes/Zad5/Main.class                 |  Bin [31m0[m -> [32m990[m bytes
 .../target/classes/Zad6/Main.class                 |  Bin [31m0[m -> [32m1362[m bytes
 .../target/classes/Zad7/Main.class                 |  Bin [31m0[m -> [32m1009[m bytes
 .../target/classes/Zad8/Main.class                 |  Bin [31m0[m -> [32m2801[m bytes
 .../target/classes/Zad9/Main.class                 |  Bin [31m0[m -> [32m1146[m bytes
 .../UdemyProjektowanieObiektowe/.idea/.gitignore   |    8 [32m+[m
 .../UdemyProjektowanieObiektowe/.idea/compiler.xml |   13 [32m+[m
 .../.idea/encodings.xml                            |    7 [32m+[m
 .../.idea/jarRepositories.xml                      |   20 [32m+[m
 .../UdemyProjektowanieObiektowe/.idea/misc.xml     |   14 [32m+[m
 .../UdemyProjektowanieObiektowe/pom.xml            |   17 [32m+[m
 .../src/main/java/Dziedziczenie/Main.java          |   40 [32m+[m
 .../main/java/Dziedziczenie/monsters/Monster.java  |   64 [32m+[m
 .../main/java/Dziedziczenie/monsters/Skeleton.java |   45 [32m+[m
 .../main/java/Dziedziczenie/monsters/Zombie.java   |   12 [32m+[m
 .../src/main/java/agreggation/Main.java            |   56 [32m+[m
 .../src/main/java/anonymousClass/Main.java         |   34 [32m+[m
 .../src/main/java/exButelka/Butelka.java           |  100 [32m+[m
 .../src/main/java/exSaldoKonta/Main.java           |   68 [32m+[m
 .../src/main/java/exceptionsTryCatch/Main.java     |   45 [32m+[m
 .../src/main/java/instanceOfTreningKlas/Main.java  |   73 [32m+[m
 .../main/java/interfaceObjectsSorting/Main.java    |   89 [32m+[m
 .../src/main/java/keywordFinal/Main.java           |   34 [32m+[m
 .../src/main/java/lambdaExpression/Main.java       |   60 [32m+[m
 .../main/java/lambdaExpressionDefault/Main.java    |   26 [32m+[m
 .../src/main/java/metodyOverloading/Main.java      |   40 [32m+[m
 .../src/main/java/nestedClasses/Main.java          |   48 [32m+[m
 .../src/main/java/nestedClassesPractice/Main.java  |   46 [32m+[m
 .../src/main/java/objectClass/Main.java            |   91 [32m+[m
 .../Main.java                                      |   67 [32m+[m
 .../src/main/java/podstawyKonstruktory/Main.java   |   51 [32m+[m
 .../src/main/java/porownywanieStringow/Main.java   |   31 [32m+[m
 .../Main.java                                      |   61 [32m+[m
 .../src/main/java/referencjeZmienne/Main.java      |   43 [32m+[m
 .../src/main/java/statycznosc/Main.java            |   54 [32m+[m
 .../target/classes/Dziedziczenie/Main.class        |  Bin [31m0[m -> [32m735[m bytes
 .../classes/Dziedziczenie/monsters/Monster.class   |  Bin [31m0[m -> [32m1746[m bytes
 .../classes/Dziedziczenie/monsters/Skeleton.class  |  Bin [31m0[m -> [32m1851[m bytes
 .../classes/Dziedziczenie/monsters/Zombie.class    |  Bin [31m0[m -> [32m556[m bytes
 .../target/classes/agreggation/Address.class       |  Bin [31m0[m -> [32m1001[m bytes
 .../target/classes/agreggation/Main.class          |  Bin [31m0[m -> [32m748[m bytes
 .../target/classes/agreggation/Worker.class        |  Bin [31m0[m -> [32m1131[m bytes
 .../target/classes/anonymousClass/Button.class     |  Bin [31m0[m -> [32m480[m bytes
 .../target/classes/anonymousClass/Main$1.class     |  Bin [31m0[m -> [32m685[m bytes
 .../target/classes/anonymousClass/Main.class       |  Bin [31m0[m -> [32m678[m bytes
 .../classes/anonymousClass/PressAction.class       |  Bin [31m0[m -> [32m134[m bytes
 .../target/classes/exButelka/Butelka.class         |  Bin [31m0[m -> [32m2637[m bytes
 .../target/classes/exSaldoKonta/Account.class      |  Bin [31m0[m -> [32m1310[m bytes
 .../target/classes/exSaldoKonta/Main.class         |  Bin [31m0[m -> [32m1145[m bytes
 .../target/classes/exceptionsTryCatch/Main.class   |  Bin [31m0[m -> [32m1789[m bytes
 .../classes/exceptionsTryCatch/OurException.class  |  Bin [31m0[m -> [32m357[m bytes
 .../classes/instanceOfTreningKlas/Main.class       |  Bin [31m0[m -> [32m990[m bytes
 .../classes/instanceOfTreningKlas/Person.class     |  Bin [31m0[m -> [32m466[m bytes
 .../classes/instanceOfTreningKlas/Student.class    |  Bin [31m0[m -> [32m1214[m bytes
 .../classes/instanceOfTreningKlas/Worker.class     |  Bin [31m0[m -> [32m1489[m bytes
 .../interfaceObjectsSorting/Interface1.class       |  Bin [31m0[m -> [32m195[m bytes
 .../interfaceObjectsSorting/Interface2.class       |  Bin [31m0[m -> [32m119[m bytes
 .../classes/interfaceObjectsSorting/Main.class     |  Bin [31m0[m -> [32m1377[m bytes
 .../classes/interfaceObjectsSorting/Worker.class   |  Bin [31m0[m -> [32m1013[m bytes
 .../target/classes/keywordFinal/Main.class         |  Bin [31m0[m -> [32m381[m bytes
 .../target/classes/keywordFinal/Person.class       |  Bin [31m0[m -> [32m267[m bytes
 .../target/classes/keywordFinal/Programista.class  |  Bin [31m0[m -> [32m280[m bytes
 .../target/classes/keywordFinal/Worker.class       |  Bin [31m0[m -> [32m470[m bytes
 .../lambdaExpression/ActionAfterClicking2.class    |  Bin [31m0[m -> [32m148[m bytes
 .../target/classes/lambdaExpression/Button.class   |  Bin [31m0[m -> [32m781[m bytes
 .../target/classes/lambdaExpression/Main$1.class   |  Bin [31m0[m -> [32m693[m bytes
 .../target/classes/lambdaExpression/Main.class     |  Bin [31m0[m -> [32m1737[m bytes
 .../classes/lambdaExpression/PressAction.class     |  Bin [31m0[m -> [32m136[m bytes
 .../target/classes/metodyOverloading/Main.class    |  Bin [31m0[m -> [32m725[m bytes
 .../target/classes/metodyOverloading/Test.class    |  Bin [31m0[m -> [32m719[m bytes
 .../target/classes/nestedClasses/A$B.class         |  Bin [31m0[m -> [32m709[m bytes
 .../target/classes/nestedClasses/A$C.class         |  Bin [31m0[m -> [32m514[m bytes
 .../target/classes/nestedClasses/A.class           |  Bin [31m0[m -> [32m635[m bytes
 .../target/classes/nestedClasses/Main.class        |  Bin [31m0[m -> [32m793[m bytes
 .../BankAccount$Interest.class                     |  Bin [31m0[m -> [32m789[m bytes
 .../nestedClassesPractice/BankAccount.class        |  Bin [31m0[m -> [32m810[m bytes
 .../classes/nestedClassesPractice/Main.class       |  Bin [31m0[m -> [32m743[m bytes
 .../target/classes/objectClass/Main.class          |  Bin [31m0[m -> [32m1232[m bytes
 .../target/classes/objectClass/Punkt.class         |  Bin [31m0[m -> [32m1428[m bytes
 .../KontoBankowe.class                             |  Bin [31m0[m -> [32m714[m bytes
 .../Main.class                                     |  Bin [31m0[m -> [32m877[m bytes
 .../target/classes/podstawyKonstruktory/Main.class |  Bin [31m0[m -> [32m1184[m bytes
 .../classes/podstawyKonstruktory/Punkt.class       |  Bin [31m0[m -> [32m698[m bytes
 .../target/classes/porownywanieStringow/Main.class |  Bin [31m0[m -> [32m963[m bytes
 .../Foo.class                                      |  Bin [31m0[m -> [32m369[m bytes
 .../Main.class                                     |  Bin [31m0[m -> [32m1102[m bytes
 .../Test.class                                     |  Bin [31m0[m -> [32m730[m bytes
 .../target/classes/referencjeZmienne/Main.class    |  Bin [31m0[m -> [32m948[m bytes
 .../target/classes/referencjeZmienne/Test.class    |  Bin [31m0[m -> [32m309[m bytes
 .../target/classes/statycznosc/Klient.class        |  Bin [31m0[m -> [32m502[m bytes
 .../target/classes/statycznosc/Main.class          |  Bin [31m0[m -> [32m937[m bytes
 .../target/classes/statycznosc/Matematyka.class    |  Bin [31m0[m -> [32m417[m bytes
 .../TickTackToe/.idea/.gitignore                   |    8 [32m+[m
 .../TickTackToe/.idea/compiler.xml                 |   13 [32m+[m
 .../TickTackToe/.idea/encodings.xml                |    7 [32m+[m
 .../TickTackToe/.idea/jarRepositories.xml          |   20 [32m+[m
 2023-02-23 TickTackToe/TickTackToe/.idea/misc.xml  |   14 [32m+[m
 2023-02-23 TickTackToe/TickTackToe/TickTackToe.iml |   15 [32m+[m
 2023-02-23 TickTackToe/TickTackToe/pom.xml         |   17 [32m+[m
 .../src/main/java/TickTackToe/Main.java            |  230 [32m++[m
 .../target/classes/TickTackToe/Main.class          |  Bin [31m0[m -> [32m4847[m bytes
 .../Java zaawansowana - zadania.pdf"               |  Bin [31m0[m -> [32m430550[m bytes
 .../Java_zaawansowana_-_rozwi\304\205zania.pdf"    |  Bin [31m0[m -> [32m717657[m bytes
 .../JavaAdvancedEx/.gitignore                      |   38 [32m+[m
 .../JavaAdvancedEx/.idea/.gitignore                |    3 [32m+[m
 .../JavaAdvancedEx/.idea/encodings.xml             |    7 [32m+[m
 .../JavaAdvancedEx/.idea/misc.xml                  |   14 [32m+[m
 .../JavaAdvancedEx/pom.xml                         |   17 [32m+[m
 .../JavaAdvancedEx/src/main/java/OOP/Ex1/Main.java |   17 [32m+[m
 .../src/main/java/OOP/Ex1/Point2D.java             |   47 [32m+[m
 .../src/main/java/OOP/Ex1/Point3D.java             |   35 [32m+[m
 .../src/main/java/OOP/Ex1/Staff.java               |    5 [32m+[m
 .../JavaAdvancedEx/src/main/java/OOP/Ex2/Main.java |   22 [32m+[m
 .../src/main/java/OOP/Ex2/Person.java              |   41 [32m+[m
 .../src/main/java/OOP/Ex2/Staff.java               |   35 [32m+[m
 .../src/main/java/OOP/Ex2/Student.java             |   44 [32m+[m
 .../src/main/java/OOP/Ex3AndEx4/Circle.java        |   39 [32m+[m
 .../src/main/java/OOP/Ex3AndEx4/Main.java          |   38 [32m+[m
 .../src/main/java/OOP/Ex3AndEx4/Rectangle.java     |   49 [32m+[m
 .../src/main/java/OOP/Ex3AndEx4/Shape.java         |   47 [32m+[m
 .../src/main/java/OOP/Ex3AndEx4/Square.java        |   33 [32m+[m
 .../JavaAdvancedEx/src/main/java/OOP/Ex5/Line.java |   50 [32m+[m
 .../JavaAdvancedEx/src/main/java/OOP/Ex5/Main.java |   17 [32m+[m
 .../JavaAdvancedEx/src/main/java/OOP/Ex6/Main.java |   21 [32m+[m
 .../src/main/java/OOP/Ex6/Movable.java             |    9 [32m+[m
 .../src/main/java/OOP/Ex6/MovableCircle.java       |   45 [32m+[m
 .../src/main/java/OOP/Ex6/MovablePoint.java        |   46 [32m+[m
 183 files changed, 5938 insertions(+)
