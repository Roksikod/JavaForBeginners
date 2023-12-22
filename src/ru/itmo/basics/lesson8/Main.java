package ru.itmo.basics.lesson8;

import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {

        try {
            logger.info("OK");
            throwMyCheckedException();
            throwMyUncheckedException();

        } catch (MyUncheckedException e) {
            System.err.println("MyUncheckedException");
            logger.warning("warning");

        } catch (MyCheckedException e) {
//            logger.error();  доступен в расширенной Java
            throw new MyUncheckedException(e.getMessage());

        } catch (Exception e) {
            System.err.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }

    public static void throwMyCheckedException() throws MyCheckedException {
        throw new MyCheckedException("some checked exception");
    }

    public static void throwMyUncheckedException() throws MyUncheckedException, MyCheckedException {
        throw new MyUncheckedException("some unchecked exception");
    }
}