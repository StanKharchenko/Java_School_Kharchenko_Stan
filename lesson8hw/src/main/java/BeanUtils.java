import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by sbt-harchenko-ss on 17.04.2017.
 */
public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) {
        for (Method fromMethod:from.getClass().getMethods()) {          // перебираем методы объекта "from"
            if (fromMethod.getName().startsWith("get")) {               // если нашли геттер, ищем для него сеттер в объекте "to"
                for (Method toMethod : to.getClass().getMethods()) {    // перебираем методы объекта "to"
                    if (toMethod.getName().startsWith("set") &&         // если нашли сеттер, проверяем:
                            toMethod.getName().substring(3).equals(fromMethod.getName().substring(3)) &&    // сверяем названия методов
                            toMethod.getParameterTypes()[0].equals(fromMethod.getReturnType())){           // сверяем типы возвращаемых и передаваемых параметров
                        try {
                            toMethod.invoke(to, (fromMethod.invoke(from,null)));        // вызываем сеттер объекта "to" и записываем в него то, что возвращает геттер объекта "from"
                            break;
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}