/**
 * The Calculator class provides methods for performing addition, subtraction, multiplication, and
 * division operations on two operands.
 */
class Calculator{
    float addition (float operand_1, float operand_2){
        return(operand_1 + operand_2);
    }


float subtraction (float operand_1, float operand_2){
    return(operand_1 - operand_2);
}


float multiplication (float operand_1, float operand_2){
    return(operand_1 * operand_2);}

    
float division (float operand_1, float operand_2){
    return(operand_1 / operand_2);

}
float square (float operand_1){
    return(operand_1 * operand_1);
}
float cube (float operand_1){
    return((operand_1 * operand_1 )*operand_1);
}
// The code is defining a `main` method, which is the entry point of the Java program. Inside the
// `main` method, it declares two float variables `operand_1` and `operand_2` and assigns them the
// values 10 and 5 respectively.

public static void main(String[] args){
    float operand_1 = 10;
    float operand_2 = 5;
    Calculator calc = new Calculator();
    float add_result = calc.addition(operand_1, operand_2);
    System.out.println("Result of addition is: "+add_result);
  // The code is performing subtraction between `operand_1` and `operand_2` using the `subtraction`
  // method of the `Calculator` class. The result of the subtraction is stored in the variable
  // `sub_result`. Then, it prints the result of the subtraction using `System.out.println()`.
    float sub_result = calc.subtraction(operand_1, operand_2);
    System.out.println("Result of subtraction is: "+sub_result);
 // The code is performing multiplication between `operand_1` and `operand_2` using the
 // `multiplication` method of the `Calculator` class. The result of the multiplication is stored in
 // the variable `mul_result`. Then, it prints the result of the multiplication using
 // `System.out.println()`.
    float mul_result = calc.multiplication(operand_1, operand_2);
    System.out.println("Result of multiplication is: "+mul_result);
// The code is performing division between `operand_1` and `operand_2` using the `division` method of
// the `Calculator` class. The result of the division is stored in the variable `div_result`. Then, it
// prints the result of the division using `System.out.println()`.
    float div_result = calc.division(operand_1, operand_2);
    System.out.println("Result of division is: "+div_result);

    float square_result = calc.square(operand_1);
    System.out.println("Result of square is: "+square_result);

    float cube_result = calc.cube(operand_1);
    System.out.println("Result of cube is: "+cube_result);

}
}