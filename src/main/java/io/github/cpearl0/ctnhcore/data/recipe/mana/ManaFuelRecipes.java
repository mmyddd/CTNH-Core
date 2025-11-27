package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import fr.lucreeper74.createmetallurgy.data.recipes.CMRecipeProvider;
import fr.lucreeper74.createmetallurgy.registries.CMRecipeTypes;
import io.github.cpearl0.ctnhcore.data.recipe.utils.BotaniaIngredients;
import io.github.cpearl0.ctnhcore.registry.*;
import io.github.cpearl0.ctnhcore.registry.machines.multiblock.MultiblocksA;
import io.github.cpearl0.ctnhcore.registry.machines.multiblock.MultiblocksB;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHRecipeType;
import vazkii.botania.common.block.BotaniaDoubleFlowerBlock;
import vazkii.botania.common.block.BotaniaFlowerBlock;
import vazkii.botania.common.block.BotaniaFlowerBlocks;
import vazkii.botania.common.item.BotaniaItems;
import mythicbotany.register.ModItems;
import mythicbotany.register.ModBlocks;
import vazkii.botania.common.lib.BotaniaTags;

import java.util.function.Consumer;

import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;


public class ManaFuelRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("magic_fuel_generator")
                .inputItems(MultiblocksA.FUEL_REFINING_FACTORY)
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.AlfSteel, 64))
                .inputItems(BotaniaFlowerBlocks.pureDaisy)
                .inputItems(ModBlocks.witherAconite)
                .inputItems(BotaniaFlowerBlocks.gourmaryllis)
                .inputItems(BotaniaFlowerBlocks.shulkMeNot)
                .inputItems(BotaniaFlowerBlocks.rosaArcana)
                .inputItems(CTNHBlocks.CASING_OSMIRIDIUM)
                .outputItems(MultiblocksB.MAGIC_FUEL_GENERATOR)
                .inputFluids(CTNHMaterials.Zenith_essence, 1000)
                .EUt(GTValues.V[GTValues.IV])
                .duration(1000)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("mana_stable_cooldown")
                .inputFluids(GTMaterials.PCBCoolant, 5000)
                .inputFluids(CTNHMaterials.ElfFuel, 5000)
                .inputFluids(CTNHMaterials.Cryotheum, 5000)
                .inputFluids(GTMaterials.Neon, 5000)
                .inputItems(ModItems.niflheimRune)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(25000))
                .EUt(32678)
                .duration(200)
                .save(provider);

        GTRecipeTypes.LARGE_CHEMICAL_RECIPES.recipeBuilder("mana_stable_cooldown")
                .inputFluids(GTMaterials.PCBCoolant, 1000)
                .inputFluids(GTMaterials.Neon, 1000)
                .inputFluids(CTNHMaterials.ElfFuel, 1000)
                .inputFluids(CTNHMaterials.Cryotheum, 1000)
                .inputItems(ModItems.niflheimRune)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(5000))
                .EUt(GTValues.VHA[GTValues.EV])
                .duration(200)
                .save(provider);

        GTRecipeTypes.LARGE_CHEMICAL_RECIPES.recipeBuilder("elf_fuel")
                .inputFluids(CTNHMaterials.Mana, 5000)
                .inputFluids(GTMaterials.Carbon, 2000)
                .inputFluids(GTMaterials.Argon, 1000)
                .inputFluids(GTMaterials.Neon, 1000)
                .outputFluids(CTNHMaterials.ElfFuel.getFluid(5000))
                .EUt(GTValues.VHA[GTValues.EV])
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("elf_fuel_active")
                .chancedInput(BotaniaFlowerBlocks.pureDaisy.asItem().getDefaultInstance(), 2000, -1000)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.Elementium, 16))
                .inputItems(ModItems.niflheimRune)
                .inputItems(GTBlocks.INDUSTRIAL_TNT, 4)
                .inputFluids(CTNHMaterials.ElfFuel, 1440)
                .inputFluids(CTNHMaterials.Mana, 7200)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.ElfFuelActive.getFluid(2880))
                .EUt(GTValues.V[GTValues.IV])
                .duration(200)
                .save(provider);
    }
}
