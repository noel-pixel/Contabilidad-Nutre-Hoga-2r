package com.nutrehogar.sistemacontable.domain.util.order;


/**
 * Enum que define los campos por los cuales se puede ordenar el Mayor General.
 */
public enum MayorGeneralOrderField {
    CODIGO_CUENTA("codigoCuenta"),
    NOMBRE_CUENTA("nombreCuenta"),
    FECHA("fecha"),
    CONCEPTO("concepto"),
    SALDO("saldo");

    private final String fieldName;

    /**
     * Constructor de {@code MayorGeneralOrderField}.
     *
     * @param fieldName Nombre del campo en la entidad.
     */
    MayorGeneralOrderField(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * Obtiene el nombre del campo correspondiente en la entidad.
     *
     * @return Nombre del campo.
     */
    public String getFieldName() {
        return fieldName;
    }
}