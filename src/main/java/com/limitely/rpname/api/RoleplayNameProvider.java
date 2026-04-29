package com.limitely.rpname.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.Consumer;

public interface git initRoleplayNameProvider {

    @Nullable
    RoleplayPassport getPassport(@NotNull UUID uuid);

    void getPassportAsync(@NotNull UUID uuid, @NotNull Consumer<@Nullable RoleplayPassport> callback);

    boolean isRegistered(@NotNull UUID uuid);
}
