package Day2;

/**
 * Created by felipeluna on 20/12/16.
 */
class Keypad {
    int value;

    Keypad(int value){
        this.value = value;
    }

    void move(char cmd){
        if(cmd == 'U'){
            int n = this.value - 3;
            if(n > 0){
                this.value = n;
            }
        }else if(cmd == 'L'){
            if(!(this.value == 1 || this.value == 4 || this.value == 7)){
                this.value -= 1;
            }
        }else if(cmd == 'R'){
            if(!(this.value == 3 || this.value == 6 || this.value == 9)){
                this.value += 1;
            }
        }else{
            int n = this.value + 3;
            if(n < 10){
                this.value = n;
            }
        }

    }
    void printValue(){
        System.out.println(this.value);
    }
}
