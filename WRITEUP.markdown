<h3> Part 2 Write-up</h3>

A really simple solution would literally to have system.out.println(“1”), system.out.println(“2”), <br>
system.out.println(“fizz”), and so forth until we reach 17. Another possibility is to define n as an <br>
integer = 17 and then write the for loop and if/else statements corresponding to fizz buzz. It would <br>
not involve user input and therefore the import.java.util.Scanner would be deleted as would the Scanner <br>
keyboard. Then when compiled would just run for n=17 each time.<br>

<h3> Part 3 Write-up</h3>

Since part 2 is interactive, you could, when prompted to ask to enter a number, tested and printed the <br>
values of -10, -1, 0, 1, 7, and 17. You would make the class non-interactive by removing the import <br>
java.util.Scanner and Scanner keyboard, and then create areas that test fizzbuzztest at -10, -1, 0, 1, 7, <br>
and 17.<br>

<h3> Part 4 Write-up</h3>

The parts that remain the same are the for loop as well as the if/else statements. They are the core of the <br>
program and create the fizz buzz sequence. The parts that do not remain the same System.out.printlns used in <br>
part 2 but in 3 and 4 they are stored so they aren’t printed, but they can be returned which in this case the<br>
could would still change since you would use “return” as opposed to “System.out.println.” Part 3 added on the<br>
addition of a public static String[] which was different from part 2 because in part 2, everyone was stored <br>
in the public static void. In part 3 that changed because the public static void then was made to simply<br>
recall fizztest (the public static String[]).<br>