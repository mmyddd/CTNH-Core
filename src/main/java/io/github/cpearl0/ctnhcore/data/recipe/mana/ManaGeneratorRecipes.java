package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.common.data.machines.GTMultiMachines;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import fr.lucreeper74.createmetallurgy.data.recipes.CMRecipeProvider;
import fr.lucreeper74.createmetallurgy.registries.CMRecipeTypes;
import io.github.cpearl0.ctnhcore.data.materials.SecondMaterials;
import io.github.cpearl0.ctnhcore.data.recipe.utils.BotaniaIngredients;
import io.github.cpearl0.ctnhcore.registry.*;
import io.github.cpearl0.ctnhcore.registry.machines.multiblock.MultiblocksA;
import io.github.cpearl0.ctnhcore.registry.machines.multiblock.MultiblocksB;
import io.github.cpearl0.ctnhcore.registry.nuclear.NuclearMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHRecipeType;
import vazkii.botania.common.block.BotaniaDoubleFlowerBlock;
import vazkii.botania.common.block.BotaniaFlowerBlock;
import vazkii.botania.common.block.BotaniaFlowerBlocks;
import vazkii.botania.common.item.BotaniaItems;
import mythicbotany.register.ModItems;
import mythicbotany.register.ModBlocks;
import vazkii.botania.common.lib.BotaniaTags;
import wayoftime.bloodmagic.common.fluid.BloodMagicFluids;
import wayoftime.bloodmagic.common.item.BloodMagicItems;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys.PLASMA;
import static io.github.cpearl0.ctnhcore.registry.CTNHMaterials.Cerrobase140;
import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;

public class ManaGeneratorRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        //魔力CPU晶圆
        GTRecipeTypes.ASSEMBLER_RECIPES.recipeBuilder("mana_generator_turbine_tier3")
                .inputItems(MultiblocksA.MANA_GENERATOR_TIER2)
                .inputItems(CustomTags.LuV_CIRCUITS)
                .inputItems(GTMultiMachines.EXTREME_COMBUSTION_ENGINE)
                .inputItems(ModItems.muspelheimRune)
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.TerraSteel, 4))
                .inputFluids(CTNHMaterials.ManaStableCooldown,10000)
                .outputItems(MultiblocksA.MANA_GENERATOR_TIER3)
                .EUt(GTValues.VA[GTValues.IV])
                .duration(200)
                .save(provider);

        GTRecipeTypes.ASSEMBLY_LINE_RECIPES.recipeBuilder("mana_generator_turbine_tier4")
                .inputItems(MultiblocksA.MANA_GENERATOR_TIER1)
                .inputItems(MultiblocksA.MANA_GENERATOR_TIER2)
                .inputItems(MultiblocksA.MANA_GENERATOR_TIER3)
                .inputItems(GTMultiMachines.LARGE_PLASMA_TURBINE)
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.ManaSteel, 64))
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.Elementium, 32))
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.TerraSteel, 16))
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.AlfSteel, 8))
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.ManaPlus, 4))
                .inputItems(ChemicalHelper.get(TagPrefix.gear, CTNHMaterials.ManaSuperPlus, 2))
                .inputItems(BotaniaItems.runeFire)
                .inputItems(BotaniaItems.runeSummer)
                .inputItems(BotaniaItems.runeWrath)
                .inputItems(BotaniaItems.runeWrath)
                .inputItems(CTNHItems.HORIZEN_RUNE)
                .inputItems(CTNHBlocks.ALF_STEEL_CASING,4)
                .inputFluids(CTNHMaterials.Cerrobase140,16000)
                .inputFluids(CTNHMaterials.ManaStableCooldown,16000)
                .outputItems(MultiblocksA.MANA_GENERATOR_TIER4)
                .EUt(GTValues.VA[GTValues.LuV])
                .duration(400)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("blood_fuel")
                .inputFluids(CTNHMaterials.BloodFuel,6666)
                .outputFluids(new FluidStack(BloodMagicFluids.LIFE_ESSENCE_FLUID.get(),6666))
                .EUt(- GTValues.V[GTValues.LV])
                .duration(80)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("blood_fuel_active")
                .inputFluids(CTNHMaterials.BloodFuelActive,666)
                .outputFluids(CTNHMaterials.BloodFuelExhausted.getFluid(666))
                .EUt(-78)
                .duration(100)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("elf_fuel")
                .inputFluids(CTNHMaterials.ElfFuel,100)
                .outputFluids(CTNHMaterials.Mana.getFluid(5))
                .outputFluids(GTMaterials.Neon.getFluid(10))
                .EUt(GTValues.VH[GTValues.MV])
                .duration(200)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("elf_fuel_active")
                .inputFluids(CTNHMaterials.ElfFuelActive,100)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(3))
                .outputFluids(CTNHMaterials.ElfFuel.getFluid(1))
                .EUt(-108)
                .duration(200)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("starlight_fuel")
                .inputFluids(CTNHMaterials.StarlightFuel,100)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(5))
                .EUt(- GTValues.V[GTValues.MV])
                .duration(120)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("starlight_fuel_active")
                .inputFluids(CTNHMaterials.StarlightFuelActive,100)
                .outputFluids(CTNHMaterials.StarlightFuelExhausted.getFluid(100))
                .EUt(-168)
                .duration(240)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("mana_up_fuel")
                .inputFluids(CTNHMaterials.ManaUpFuel,100)
                .outputFluids(CTNHMaterials.ManaUpFuel.getFluid(5))
                .EUt(- GTValues.V[GTValues.MV])
                .duration(120)
                .save(provider);

        MANA_GENERATOR.recipeBuilder("mana_up_fuel_active")
                .inputFluids(CTNHMaterials.ManaUpFuelActive,100)
                .outputFluids(CTNHMaterials.ManaUpFuelExhausted.getFluid(100))
                .EUt(-384)
                .duration(280)
                .save(provider);
    }
}

