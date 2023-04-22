package com.megabankcorp.system;

import java.math.BigDecimal;

public abstract class Database {
    /**
     * сохраняет указанную сумму на указанный счет
     * не содержит реализации, просто сигнатура с описанием
     * доступен отовсюду
     */
    public abstract void deposit(long account, BigDecimal amount);

    /**
     * снимает указанную сумму с указанного счета
     * не содержит реализации, просто сигнатура с описанием
     * доступен отовсюду
     */
    public abstract void withdraw(long account, BigDecimal amount);

    /**
     * получает значение суммы с указанного счета
     * не содержит реализации, просто сигнатура с описанием
     * доступен только из пакета и реализаций
     */
    public abstract BigDecimal getAmount(long account);

    /**
     * передает указанную сумму с одного указанного счета на другой
     * содержит реализацию по умолчанию, использующую методы deposit и withdraw
     * доступен только из пакета
     */
    void transfer(long fromAccount, long toAccount, BigDecimal amount) {
        withdraw(fromAccount, amount);
        deposit(toAccount, amount);
    }
}
