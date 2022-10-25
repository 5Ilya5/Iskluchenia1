try {
    throw new IllegalArgumentException(), new NullPointerException();
} catch (IllegalArgumentException iae) {
    // ...
} catch (NullPointerException npe) {
    // ...
}

/*исключени А вызвано исключением В*/
try {
    Exception ex1 = new NullPointerException();
    throw new IllegalArgumentException(ex1);
} catch (IllegalArgumentException iae) {
    throw iae.getCause(); 
}

/*Использовано подавленное исключение*/
try {
    Exception ex1 = new NullPointerException();
    IllegalArgumentException ex2 = new IllegalArgumentException();
    ex2.addSuppressed(ex1);
    throw ex2;
} catch (IllegalArgumentException iae) {
    iae.getSuppressed();
}
