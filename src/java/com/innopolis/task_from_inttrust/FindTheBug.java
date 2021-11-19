/*package com.innopolis.task_from_inttrust;

import java.util.ArrayList;
import java.util.List;


public class FindTheBug {
    public List<WebElement> getSomeElements(String path) {
        if (path == null) {
            throw IllegalArgumentException("getElements: illegal path (NULL)");   // для создания исключения вручную мы
            // должны иметь объект класса Throwable, который либо получим как параметр оператора catch, либо создадим
            // с помощью оператора new. В данном случае пропущен new после throw.
            path = "//*[@id='Hello']";       //значение //*[@id='Hello'], назначенное для пути, не используется
        }
        WebDriverHelper wd = new WebDriverHelper();
        List<String> result = new ArrayList<>();
        result.add(wd.getElements(path));     // не существует метод getElements для объектов

        if (result.isEmpty()) {                                // в данном условии проверяется пустой ли список result,
            // в случае true, список пуст, мы идём дальше. И в следующем же цикле for мы должны пробежаться по каждому
            // элементу пустого списка. Нарушена логика.
            for (WebElement element : result) {
                if (element.getText() == "remove")            //  getText используется для того, чтобы получить строку,
                    //но не для того, чтобы сравнить её с другой строкой. В данном случае для сравнения двух строк
                    // имеет смысл использовать element.equals("remove")
                    result.remove(element);                  //
            }
        } else {
            return result.get(0);                            //
        }

        if (wd.isElementsPresent(path)) {                     // в случае, если есть в path хотя бы один элемент,
            // выполняется следующий блок кода. В то же время в этом же блоке находится фраза "Нет ни одного элемента
            // в этом пути". Нарушена логика
            System.out.println("There aren't any elements by this path");
            return;              // ничего не возвращется после return. По идее, должно быть написано "-1"
        }

        return result;      // метод getSomeElements ничего не возвращает
    }
}
*/