package net.Dark1.tutorialmod.item;

import net.Dark1.tutorialmod.tutorialmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class moditems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialmod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = Items.register("black_opal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}
