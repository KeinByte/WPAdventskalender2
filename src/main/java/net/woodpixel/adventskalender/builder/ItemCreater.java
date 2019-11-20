package net.woodpixel.adventskalender.builder;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.apache.commons.codec.binary.Base64;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemCreater {

    public static ItemStack customSkull(String url, String name, String loreLine) {
        ItemStack i = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
        if(url == null)return i;


        SkullMeta sm = (SkullMeta) i.getItemMeta();
        GameProfile p = new GameProfile(UUID.randomUUID(), null);
        byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", "http://textures.minecraft.net/texture/" + url).getBytes());
        p.getProperties().put("textures", new Property("textures", new String(encodedData)));
        Field profileField = null;
        try {
            profileField = sm.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(sm, p);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        sm.setDisplayName(name);
        List<String> lore = new ArrayList<String>();
        lore.add(loreLine);
        sm.setLore(lore);
        i.setItemMeta(sm);
        return i;
    }

}
