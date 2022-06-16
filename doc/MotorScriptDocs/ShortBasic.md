# MotorScript

# Table of content

- [Short Basic](#Short-Basic)
- [Array](#Array)
    - [Creating a Array](#Creating-a-Array)
    - [Search and Adjust element in Array](#Search-and-Adjust-element-in-Array)
        - [Search element](#Search-element)
        - [Adjust element](#Adjust-element)
    - [Add element to a Array](#Add-element-to-a-Array)
- [Scanner](#Scanner)
- [Whileloop](#Whileloop)
- [IfStatement](#IfStatement)
- [PrintStatement](#PrintStatement)

## Short Basic

|         | Moterscript name |    Example    |
|:-------:|:----------------:|:-------------:|
|    +    |     upshift      |  1 upshift 1  |
|    -    |    downshift     | 1 downshift 1 |
|    *    |      nitro       |   1 nitro 1   |
|    /    |      divide      |  1 divide 1   |
|    +    |     upshift      |  1 upshift 1  |
| Integer |     inline4      |       1       |
|  float  |      flat4       |      1.2      |
| boolean |        ev        |     true      |

## Array

### Creating a Array

1. Initialize which type your going to use and use open & closed blocks
    1. "inline4[]"
        1. *Only integers are allowed.*
2. Give it an Identifier (name)
    1. "inline4[] cookies"
3. Initialize the arraysizetype with a type and a number.
    1. "inline4[] cookies is new"
        1. *The type has to be the same as first initialize type.*
        2. *The number can't be 0 or a negative number.*
4. Put within blocks after the type your array size and end the statement with a #
    1. "inline4[] cookies is new inline4[10]#"

Result: inline4[] cookies is new inline4[10]#

### Search and Adjust element in Array

By using the identifier from the array and index number your able to print or adjust an element from the array.

#### Search element

Example :
inline4[] array is new inline4[10]# array[0] is 7# burnout(array[0])#

1. First start with the identifier
    1. "array"
2. Inside blocks put the index number from the array you want to use.
    1. "array[0]"
3. Now you could print this out by using the burnout statement or use it as new integer.
    1. burnout(array[0])#
    2. inline4 answer is array[0]#

#### Adjust element

1. First start with the identifier
    1. "array"
2. Inside blocks put the index number where you want adjust a number.
    1. "array[0]"
3. Use the assignment operator (is) and add the new number you want to have on that location and end the statement.
    1. "array[0] is 7#"

Result : array[0] is 7#

### Add element to a Array

1. First start with the identifier
    1. "array"
2. Inside blocks put the index number where you want to add a number.
    1. "array[3]"
3. Use the assignment operator (is) and add the number you want to add.
    1. "array[3] is 22#"

Result : array[3] is 22#

## Scanner

With the scanner we can use the input of the user. Create and use the scanner To creat

1. Create the scanner with an identifier o Scanner input#
2. Now you can use the scanner by calling the identifier.scan
    1. input.scan
        1. only String & Integers are allowed

Result: answer is input.scan#

## Whileloop

The user is able to use while loop to run certain code until specific condition is met.

while(answer1 != guess) { burnout(feedback)# answer1 is input.scan# } Create and use a while loop

1. Start to the declare the while statement and put inside parentheses your condition o While (1>2)
    1. The result of the statement must be a Boolean
2. Put something inside brackets what you want to run during the condition
    1. while(1>2) {burnout(123)#}
        1. The word break is not made, the user need to end their own loop.

Result: while(1>2) { burnout(123)# }

## Ifstatement

The user is allowed to use if statements in motorscript to set specific rules Create and use if statement

1. Start to the declare the if statement and put inside parentheses your condition
    1. If(example)
        1. The result of the statement must be a boolean
2. Now place within blockstatement(brackets) your code you want to run
    1. if(example) {burnout("You made a mistake")#}
3. It is possible to add else if statement but this is not required
    1. if(example) {burnout("You made a mistake")#} else { burnout(test)#}

Result:

if(example) { burnout("You made a mistake")# } else { burnout(test)# }

## Printstatement

By using burnout the user can print something out.

Create and use print statement

- First declare burnout and put within parentheses the code you want to have printed
    - Burnout(1)#
        - The input cant be null



## Functions
In motorscript we have support for functions like java. However, in our language we only support functions without arguments and with the return type op void.

 ###Declare a function
Enter the function keyword (funky), use the return type of void and an identifier followed by parentheses and. then opening and closing brackets. between the brackets you can put your code.
   - funky void test() { burnout(test)# }.


###Call a function
You can call a function by using the identifier and the parentheses.
   - test()#
