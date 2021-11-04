package com.company;

public class ServiceProviderFramework {
    private BookLibrary javaBookLibrary;
    private BookReader bookReader;

    public ServiceProviderFramework(){
        javaBookLibrary = new JavaBookLibrary();
        bookReader = new BookReader(javaBookLibrary);
    }

    public BookLibrary getJavaBookLibrary() {
        return javaBookLibrary;
    }

    public BookReader getBookReader() {
        return bookReader;
    }

}
