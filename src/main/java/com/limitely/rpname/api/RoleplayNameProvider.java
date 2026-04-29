package com.limitely.rpname.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Consumer;

public interface git initRoleplayNameProvider {

    /**
     * Возвращает паспорт ТОЛЬКО если игрок онлайн и закэширован.
     * Для офлайн-игроков всегда возвращает null — используй {@link #getPassportAsync}.
     */
    @Nullable
    RoleplayPassport getPassport(@NotNull UUID uuid);

    /**
     * Асинхронно загружает паспорт из БД. Callback вызывается на главном потоке.
     * Работает и для онлайн-, и для офлайн-игроков.
     */
    void getPassportAsync(@NotNull UUID uuid, @NotNull Consumer<@Nullable RoleplayPassport> callback);

    /**
     * Проверяет регистрацию только по кэшу (только онлайн-игроки).
     */
    boolean isRegistered(@NotNull UUID uuid);
}
