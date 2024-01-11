package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class Premium_THEFT {

   // @Override
    public BigDecimal calculate(Policy policy) {

        List<InsuredObject> insuredObjects = Arrays.asList(policy.getInsuredObject());//Забираю из policy объекты SubObjects
        List<SubObject> subObjects = insuredObjects.stream()
                //Получаем список всех SubObjects, объединяя списки подобъектов из всех InsuredObjects
                .flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject()))
                .toList();

        return subObjects.stream()
                .filter(subObject -> subObject.getRiskType().equals(RiskType.THEFT))//фильтрация по типу риска
                //собираю стоимость каждого застрахованного объекта
                .map(SubObject::getSubObjectInsurancePrise)
                //сумма всех стоимостей - reduce сохраняет результат и затем опять же применяет к этому результату и следующему элементу
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        //Возврат BigDecimal.
    }
}
