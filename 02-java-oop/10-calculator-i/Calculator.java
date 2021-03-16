public class Calculator {
    private double num1;
    private double num2;
    private double result;
    private char operator;

    public Calculator() {

    }

    public void setNum1(double input){
        this.num1 = input;
    }

    public void setNum2(double input){
        this.num2 = input;
    }

    public void setoperator(char input){
        this.operator = input;
    }

    public void calculation(){
        if (this.operator == '+'){
            result = (num1) + (num2);
        }else if(this.operator == '-'){
            result = (num1) - (num2);
        }
    }

    public void getResult(){
        System.out.println(result);
    }


}