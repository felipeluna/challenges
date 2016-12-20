package Day2;

/**
 * Created by felipeluna on 20/12/16.
 */
class WeirdKeypad {
    char [][] kpad;
    int x = 2;
    int y = 0;
    WeirdKeypad(char [][] value){
        this.kpad = value;
    }

    void move(char cmd) {
        if(cmd == 'U'){
            if((this.x - 1) > -1 ){
               if(this.kpad[this.x - 1][this.y] != '0'){
                   this.x--;
               }
            }
        }
        if(cmd == 'D'){
            if((this.x + 1) < 5 ){
                if(this.kpad[this.x + 1][this.y] != '0'){
                    this.x++;
                }
            }
        }
        if(cmd == 'L'){
            if((this.y - 1) > -1 ){
                if(this.kpad[this.x][this.y - 1] != '0'){
                    this.y--;
                }
            }
        }
        if(cmd == 'R'){
            if((this.y + 1) < 5 ){
                if(this.kpad[this.x][this.y + 1] != '0'){
                    this.y++;
                }
            }
        }

    }

    void printValue(){
        System.out.print(this.kpad[this.x][this.y]);
    }
}
