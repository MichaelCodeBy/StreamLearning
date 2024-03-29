package Abstract;

// абстрактный класс фигуры
// хрестоматийным примером является система геометрических фигур. В реальности не существует
// геометрической фигуры как таковой. Есть круг, прямоугольник, квадрат, но просто фигуры нет.
// Однако же и круг, и прямоугольник имеют что-то общее и являются фигурами.

abstract class Figure{

    float x; // x-координата точки
    float y; // y-координата точки

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }
    // абстрактный метод для получения периметра
    public abstract float getPerimeter();
    // абстрактный метод для получения площади
    public abstract float getArea();
}
// производный класс прямоугольника
class Rectangle extends Figure
{
    private float width;
    private float height;

    // конструктор с обращением к конструктору класса Figure
    Rectangle(float x, float y, float width, float height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }
}
