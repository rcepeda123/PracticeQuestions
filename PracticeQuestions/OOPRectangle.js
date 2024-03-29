/*. Write a JavaScript program to create a class called 'Rectangle' with properties for width and height. 
Include two methods to calculate rectangle area and perimeter. Create an instance of the 'Rectangle' class and calculate its area and perimeter.*/
class Rectangle{
    constructor(height, width){
    this.width = width;
    this.height = height;
    }

    calculateArea(){
        return this.height * this.width;
    }
    calculatePerimeter(){
        return 2 * this.height + this.width;
    }
}
    // Create an instance of the Rectangle class
    const rectangle = new Rectangle(12, 10);

    // Calculate area and perimeter of the rectangle
    const area = rectangle.calculateArea();
    const perimeter = rectangle.calculatePerimeter();

    // Display the results
    console.log(`Rectangle Area: ${area}`);
    console.log(`Rectangle Perimeter: ${perimeter}`);
