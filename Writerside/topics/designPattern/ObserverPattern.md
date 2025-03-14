# Observer_Pattern

자바의 `Observer` 인터페이스는 관찰자 패턴을 구현하는 데 사용됩니다. 관찰자 패턴은 객체의 상태가 변경되었을 때 다른 객체들에게 통지하는 디자인 패턴입니다. `Observer` 인터페이스는 `update(Observable o, Object arg)` 메서드를 가지고 있으며, 이 메서드는 관찰 대상 객체의 상태가 변경되었을 때 호출됩니다.

다음은 `Observer` 인터페이스의 `update(Observable o, Object arg)` 메서드를 구현하는 예제입니다.

```java
import java.util.Observable;
import java.util.Observer;

// 관찰 대상 클래스
class WeatherData extends Observable {
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
        setChanged(); // 상태가 변경됨을 표시
        notifyObservers(weather); // 관찰자들에게 통지
    }

    public String getWeather() {
        return weather;
    }
}

// 관찰자 클래스
class WeatherObserver implements Observer {
    private String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            System.out.println(name + "님, 현재 날씨는 " + arg + "입니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 관찰자 등록
        weatherData.addObserver(new WeatherObserver("홍길동"));
        weatherData.addObserver(new WeatherObserver("이순신"));

        // 날씨 정보 변경
        weatherData.setWeather("맑음");
        weatherData.setWeather("흐림");
    }
}
```

이 예제에서는 `WeatherData` 클래스가 관찰 대상 객체이고, `WeatherObserver` 클래스가 관찰자 객체입니다. `WeatherData` 클래스는 `Observable` 클래스를 상속받아 관찰 대상 객체가 됩니다. `WeatherObserver` 클래스는 `Observer` 인터페이스를 구현하여 관찰자가 됩니다.

`WeatherData` 클래스의 `setWeather` 메서드에서 `setChanged` 메서드를 호출하여 상태가 변경됨을 표시하고, `notifyObservers` 메서드를 호출하여 관찰자들에게 통지합니다.

`WeatherObserver` 클래스의 `update` 메서드는 관찰 대상 객체의 상태가 변경되었을 때 호출됩니다. 이 메서드에서는 관찰 대상 객체의 상태를 출력합니다.

`Main` 클래스에서는 `WeatherData` 객체를 생성하고, 두 개의 `WeatherObserver` 객체를 등록합니다. 그리고 `WeatherData` 객체의 `setWeather` 메서드를 호출하여 날씨 정보를 변경합니다. 이때, `WeatherObserver` 객체의 `update` 메서드가 호출되어 날씨 정보가 출력됩니다.
