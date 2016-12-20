package Day1;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

class Walker{
    private int direction;
    private int x;
    private int y;
    private Set<Point> Points = new HashSet<>();
    Walker(int direction, int x, int y){
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    void changeDirection(char dir){
        if (dir == 'R'){
            this.direction = (this.direction + 1) % 4;
        }
        if(dir == 'L'){
            if(this.direction == 0){
                this.direction = 3;
            }else{
                this.direction -= 1;
            }
        }
    }

     void walk(){
        if(this.direction == 0){
            this.y += 1;
            Point p = new Point(this.x, this.y);
            if(Points.contains(p)){
                System.out.println("Twice " + Math.abs(p.x + p.y));
            }else{
                Points.add(p);
            }
        }else if(this.direction == 1){
            this.x += 1;
            Point p = new Point(this.x, this.y);
            if(Points.contains(p)){
                System.out.println("Twice " + Math.abs(p.x + p.y));
            }else{
                Points.add(p);
            }
        }else if(this.direction == 2){
            this.y -= 1;
            Point p = new Point(this.x, this.y);
            if(Points.contains(p)){
                System.out.println("Twice " + Math.abs(p.x + p.y));
            }else{
                Points.add(p);
            }
        }else{
            this.x -= 1;
            Point p = new Point(this.x, this.y);
            if(Points.contains(p)){
                System.out.println("Twice " + Math.abs(p.x + p.y));
            }else{
                Points.add(p);
            }
        }
    }

     void countFromStart(){
        System.out.println("From start " + Math.abs(this.x + this.y));
    }

}

