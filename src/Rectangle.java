public class Rectangle {
    float length, breadth;

     public Rectangle(float l,float y)
    {
        length =l;
        breadth =y;

    }
//    y if it is not public it gives error ? the above constr

    float areaRectangle(){
        return length*breadth;
    }

    float perimeterRectangle(){
        return (2*(length+breadth));
    }

}
