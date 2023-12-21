package net.soheil.shaking_of_spirits.mana;

import net.minecraft.nbt.CompoundTag;

public class PlayerMana {
    private static int mana;
    private static final int MIN_MANA = 0;
    private static final int MAX_MANA = 20;

    public static int getMana(){
        return mana;
    }

    public static void addMana(int add) {
        mana = Math.min(mana + add, MAX_MANA);
    }


    public static void subMana(int sub) {
        mana = Math.max(mana - sub, MIN_MANA);
    }

    public void copyFrom(PlayerMana source){
        mana = source.mana;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("mana", mana);
    }

    public void loadNBTData(CompoundTag nbt) {
        mana = nbt.getInt("mana");
    }
}










