package ru.itmo.basics.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {
        List<PromoCode> promos = new ArrayList<>();

        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA500", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", true));
        promos.add(new PromoCode("SKIDKA100", false));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA200", false));
        promos.add(new PromoCode("SKIDKA300", true));
        promos.add(new PromoCode("SKIDKA300", true));
        promos.add(new PromoCode("SKIDKA400", false));
        promos.add(new PromoCode("SKIDKA400", false));
        promos.add(new PromoCode("SKIDKA500", false));

        List<PromoCode> filtered = promos.stream()
                .filter(PromoCode::getExpired)
                .collect(Collectors.toList());

//        filtered.forEach(System.out::println);

//        promos.stream()
//                .filter(p -> !p.getExpired())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        promos.stream()
//                .filter(p -> p.getCode().equals("SKIDKA200"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        Map<String, List<PromoCode>> map = promos.stream()
                .collect(Collectors.groupingBy(PromoCode::getCode));

//        System.out.println(map);

//        List<PromoCode> skidka100 = map.get("SKIDKA100");
//
//        System.out.println(skidka100);

//        map.forEach((k, v) -> {
//            if (k.equals("SKIDKA500")) {
//                v.forEach(System.out::println);
//            }
//        });

//        AtomicInteger counter = new AtomicInteger();
//
//        promos.forEach(p -> {
//            if (!p.getCode().equals("SKIDKA100")) {
//                counter.getAndIncrement();
//            }
//        });
//
//        System.out.println(counter.get());

//        promos.sort(Comparator.comparing(PromoCode::getCode, Comparator.reverseOrder()));
//        System.out.println(promos);

//        List<String> codes = promos.stream()
//                .map(PromoCode::getCode)
//                .collect(Collectors.toList());
//
//        System.out.println(codes);

//        List<Car> cars = promos.stream()
//                .map(p -> new Car(p.getCode(), p.getExpired()))
//                .collect(Collectors.toList());
//
//        System.out.println(cars);


    }
}
