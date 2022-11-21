package com.task.producer.controller;

//@RestController
//public class ProductServiceController {
//    private static Map<String, Product> productRepo = new HashMap<>();
//    static {
//        Product honey = new Product();
//        honey.setId("1");
//        honey.setName("Honey");
//        productRepo.put(honey.getId(), honey);
//
//        Product almond = new Product();
//        almond.setId("2");
//        almond.setName("Almond");
//        productRepo.put(almond.getId(), almond);
//    }
//    @RequestMapping(value = "/products")
//    public ResponseEntity<Object> getProduct() {
////        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
////    }
//}