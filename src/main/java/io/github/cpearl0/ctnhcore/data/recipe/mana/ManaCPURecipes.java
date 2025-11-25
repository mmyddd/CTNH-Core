package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import fr.lucreeper74.createmetallurgy.data.recipes.CMRecipeProvider;
import fr.lucreeper74.createmetallurgy.registries.CMRecipeTypes;
import io.github.cpearl0.ctnhcore.registry.CTNHBlocks;
import io.github.cpearl0.ctnhcore.registry.CTNHFluidVeins;
import io.github.cpearl0.ctnhcore.registry.CTNHItems;
import io.github.cpearl0.ctnhcore.registry.CTNHMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHRecipeType;
import vazkii.botania.common.item.BotaniaItems;

import java.util.function.Consumer;

import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;


public class ManaCPURecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        //魔力CPU晶圆
        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("mana_cpu_wafer_silicon")
                .inputItems(GTItems.SILICON_WAFER)
                .notConsumable(BotaniaItems.lensNormal)
                .outputItems(CTNHItems.MANA_CPU_WAFER)
                .duration(900)
                .EUt(48)
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("mana_cpu_wafer_neutronium_phosphorus")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.PHOSPHORUS_WAFER)
                .notConsumable(BotaniaItems.lensNormal)
                .outputItems(CTNHItems.MANA_CPU_WAFER,4)
                .duration(500)
                .EUt(48)
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("mana_cpu_wafer_neutronium_naquadah")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.NAQUADAH_WAFER)
                .notConsumable(BotaniaItems.lensNormal)
                .outputItems(CTNHItems.MANA_CPU_WAFER,8)
                .duration(200)
                .EUt(GTValues.VA[GTValues.MV])
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("mana_cpu_wafer_neutronium")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.NEUTRONIUM_WAFER)
                .notConsumable(BotaniaItems.lensNormal)
                .outputItems(CTNHItems.MANA_CPU_WAFER,16)
                .duration(50)
                .EUt(180)
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("mana_cpu_wafer_silicon")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.SILICON_WAFER)
                .notConsumable(BotaniaItems.lensNormal)
                .outputItems(CTNHItems.MANA_CPU_WAFER)
                .duration(900)
                .EUt(48)
                .save(provider);

        //精灵CPU晶圆
        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("elementium_cpu_wafer_silicon")
                .inputItems(GTItems.SILICON_WAFER)
                .notConsumable(BotaniaItems.lensFlare)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_WAFER)
                .duration(900)
                .EUt(GTValues.VA[GTValues.HV])
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("elementium_cpu_wafer_neutronium_phosphorus")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.PHOSPHORUS_WAFER)
                .notConsumable(BotaniaItems.lensFlare)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_WAFER,4)
                .duration(500)
                .EUt(GTValues.VA[GTValues.MV])
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("elementium_cpu_wafer_neutronium_naquadah")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.NAQUADAH_WAFER)
                .notConsumable(BotaniaItems.lensFlare)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_WAFER,8)
                .duration(200)
                .EUt(180)
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("elementium_cpu_wafer_neutronium")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.NEUTRONIUM_WAFER)
                .notConsumable(BotaniaItems.lensFlare)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_WAFER,16)
                .duration(50)
                .EUt(48)
                .save(provider);

        GTRecipeTypes.LASER_ENGRAVER_RECIPES.recipeBuilder("elementium_cpu_wafer_silicon")
                .cleanroom(CleanroomType.CLEANROOM)
                .inputItems(GTItems.SILICON_WAFER)
                .notConsumable(BotaniaItems.lensFlare)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_WAFER)
                .duration(900)
                .EUt(48)
                .save(provider);

        //魔力CPU芯片
        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("mana_cpu_wafer_cut")
                .inputItems(CTNHItems.MANA_CPU_WAFER)
                .inputFluids(CTNHMaterials.Mana, 1000)
                .outputItems(CTNHItems.MANA_CPU_CHIP,8)
                .duration(900)
                .EUt(48)
                .save(provider);

        //魔力CPU芯片
        GTRecipeTypes.CUTTER_RECIPES.recipeBuilder("elementium_cpu_wafer_cut")
                .inputItems(CTNHItems.ELEMENTIUM_CPU_WAFER)
                .inputFluids(CTNHMaterials.Mana, 16000)
                .outputItems(CTNHItems.ELEMENTIUM_CPU_CHIP,8)
                .duration(900)
                .EUt(48)
                .save(provider);
    }
}
