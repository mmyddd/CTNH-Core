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
import io.github.cpearl0.ctnhcore.registry.nuclear.NuclearMaterials;
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
import wayoftime.bloodmagic.common.item.BloodMagicItems;
import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys.PLASMA;
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
        //魔力稳定剂
        MAGIC_FUEL_GENERATOR.recipeBuilder("mana_stable_cooldown_1")
                .inputFluids(GTMaterials.PCBCoolant, 5000)
                .inputFluids(CTNHMaterials.ElfFuel, 5000)
                .inputFluids(CTNHMaterials.Cryotheum, 5000)
                .inputFluids(GTMaterials.Neon, 5000)
                .inputItems(ModItems.niflheimRune)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(25000))
                .EUt(32678)
                .duration(200)
                .save(provider);

        GTRecipeTypes.LARGE_CHEMICAL_RECIPES.recipeBuilder("mana_stable_cooldown_2")
                .inputFluids(GTMaterials.PCBCoolant, 1000)
                .inputFluids(GTMaterials.Neon, 1000)
                .inputFluids(CTNHMaterials.ElfFuel, 1000)
                .inputFluids(CTNHMaterials.Cryotheum, 1000)
                .inputItems(ModItems.niflheimRune)
                .outputFluids(CTNHMaterials.ManaStableCooldown.getFluid(5000))
                .EUt(GTValues.VHA[GTValues.EV])
                .duration(200)
                .save(provider);
        //精灵燃料
        GTRecipeTypes.LARGE_CHEMICAL_RECIPES.recipeBuilder("elf_fuel_1")
                .inputFluids(CTNHMaterials.Mana, 5000)
                .inputFluids(GTMaterials.Carbon, 2000)
                .inputFluids(GTMaterials.Argon, 1000)
                .inputFluids(GTMaterials.Neon, 1000)
                .outputFluids(CTNHMaterials.ElfFuel.getFluid(5000))
                .EUt(GTValues.VHA[GTValues.EV])
                .duration(200)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("elf_fuel_2")
                .inputFluids(CTNHMaterials.Mana, 50000)
                .inputFluids(GTMaterials.Carbon,20000)
                .inputFluids(GTMaterials.Argon, 10000)
                .outputFluids(CTNHMaterials.ElfFuel.getFluid(50000))
                .EUt(760)
                .duration(500)
                .save(provider);

        MANAREACTOR.recipeBuilder("elf_fuel_active_1")
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

        MAGIC_FUEL_GENERATOR.recipeBuilder("elf_fuel_active_2")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.Elementium, 16))
                .inputItems(ModItems.alfheimRune)
                .inputItems(GTBlocks.INDUSTRIAL_TNT,4)
                .inputFluids(CTNHMaterials.ElfFuel, 1640)
                .inputFluids(CTNHMaterials.ManaPlus, 1440)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.ElfFuelActive.getFluid(8400))
                .EUt(GTValues.V[GTValues.IV])
                .duration(200)
                .save(provider);
        //精灵行星燃料
        MAGIC_FUEL_GENERATOR.recipeBuilder("elf_planet_fuel_1")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus, 8))
                .inputItems(ModItems.muspelheimRune)
                .inputFluids(CTNHMaterials.LiquidAlfheimAir, 17280)
                .inputFluids(CTNHMaterials.VibrantAlloy,2880)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.StarlightFuel.getFluid(1728))
                .EUt(GTValues.V[GTValues.LuV])
                .duration(200)
                .save(provider);

        MANAREACTOR.recipeBuilder("elf_planet_fuel_2")
                .chancedInput(BotaniaFlowerBlocks.pureDaisy.asItem().getDefaultInstance(), 2500, -1250)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus, 8))
                .inputItems(ModItems.muspelheimRune)
                .inputFluids(CTNHMaterials.LiquidAlfheimAir, 14400)
                .inputFluids(CTNHMaterials.VibrantAlloy,2880)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.StarlightFuel.getFluid(1440))
                .EUt(GTValues.V[GTValues.LuV])
                .duration(200)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("elf_planet_fuel_active_1")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus, 8))
                .inputItems(GTItems.QUANTUM_STAR)
                .inputItems(GTItems.GELLED_TOLUENE,32)
                .inputFluids(CTNHMaterials.StarlightFuel,1440)
                .inputFluids(CTNHMaterials.VibrantAlloy, 2880)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.StarlightFuelActive.getFluid(3220))
                .EUt(GTValues.V[GTValues.LuV])
                .duration(400)
                .save(provider);

        MANAREACTOR.recipeBuilder("elf_planet_fuel_active_2")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus, 8))
                .inputItems(GTItems.QUANTUM_STAR)
                .inputItems(GTItems.GELLED_TOLUENE,32)
                .inputFluids(CTNHMaterials.StarlightFuel,1440)
                .inputFluids(CTNHMaterials.VibrantAlloy, 2880)
                .inputFluids(CTNHMaterials.ManaStableCooldown, 288)
                .outputFluids(CTNHMaterials.StarlightFuelActive.getFluid(2880))
                .EUt(GTValues.V[GTValues.LuV])
                .duration(400)
                .save(provider);
        //恶魔意志燃料
        MAGIC_FUEL_GENERATOR.recipeBuilder("blood_fuel")
                .inputItems(BloodMagicItems.RAW_CRYSTAL,6)
                .addData("addlp", 66666)
                .outputFluids(CTNHMaterials.BloodFuel.getFluid(66666))
                .EUt(GTValues.VA[GTValues.IV])
                .duration(80)
                .save(provider);
        
        MANAREACTOR.recipeBuilder("blood_fuel_active")
                .chancedInput(CTNHManaItems.ENDSLATE.asStack(), 3000, -1000)
                .inputFluids(CTNHMaterials.BloodFuel, 6666)
                .inputItems(BloodMagicItems.RAW_CRYSTAL,4)
                .outputFluids(CTNHMaterials.BloodFuelActive.getFluid(9999))
                .EUt(6666)
                .duration(400)
                .save(provider);
                
        MAGIC_FUEL_GENERATOR.recipeBuilder("blood_fuel_active")
                .inputFluids(CTNHMaterials.BloodFuel, 7777)
                .inputItems(BloodMagicItems.RAW_CRYSTAL,4)
                .outputFluids(CTNHMaterials.BloodFuelActive.getFluid(11111))
                .EUt(6666)
                .duration(400)
                .save(provider);
                
        MANAREACTOR.recipeBuilder("blood_fuel_active_recycle")
                .chancedInput(CTNHManaItems.ENDSLATE.asStack(), 5000, -100)
                .inputFluids(CTNHMaterials.BloodFuelExhausted, 16666)
                .inputItems(BloodMagicItems.RAW_CRYSTAL,4)
                .outputFluids(CTNHMaterials.BloodFuelActive.getFluid(16666))
                .EUt(6666)
                .duration(200)
                .save(provider);
                
        MAGIC_FUEL_GENERATOR.recipeBuilder("blood_fuel_active_recycle")
                .inputFluids(CTNHMaterials.BloodFuelExhausted, 16666)
                .inputItems(BloodMagicItems.RAW_CRYSTAL,4)
                .outputFluids(CTNHMaterials.BloodFuelActive.getFluid(16666))
                .EUt(6666)
                .duration(800)
                .save(provider);
        //究极魔力燃料
        MANAREACTOR.recipeBuilder("gtceu:mana_up_fuel_1")
                .inputFluids(CTNHMaterials.StarlightFuel, 720)
                .inputFluids(CTNHMaterials.BloodFuel, 720)
                .inputFluids(CTNHMaterials.Zenith_essence, 720)
                .inputItems(GTItems.GELLED_TOLUENE,32)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 4))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 4))
                .notConsumable(CTNHManaItems.HORIZEN_RUNE)
                .outputFluids(CTNHMaterials.ManaUpFuel.getFluid(1440))
                .EUt(GTValues.V[GTValues.ZPM])
                .duration(100)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("mana_up_fuel_2")
                .inputFluids(CTNHMaterials.StarlightFuel, 720)
                .inputFluids(CTNHMaterials.BloodFuel, 720)
                .inputFluids(CTNHMaterials.Zenith_essence, 720)
                .inputItems(GTItems.GELLED_TOLUENE,32)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 4))
                .notConsumable(CTNHManaItems.HORIZEN_RUNE)
                .outputFluids(CTNHMaterials.ManaUpFuel.getFluid(1680))
                .EUt(GTValues.V[GTValues.ZPM])
                .duration(100)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("mana_up_fuel_active")
                .inputFluids(CTNHMaterials.ManaRadiationMixture, 720)
                .inputFluids(CTNHMaterials.ManaUpFuel, 720)
                .outputFluids(CTNHMaterials.ManaUpFuelActive.getFluid(720))
                .EUt(GTValues.V[GTValues.UV])
                .duration(600)
                .save(provider);

        GTRecipeTypes.CENTRIFUGE_RECIPES.recipeBuilder("starlight_fuel_exhausted_recycle_1")
                .inputFluids(CTNHMaterials.StarlightFuelExhausted, 1000)
                .outputFluids(CTNHMaterials.StarlightFuel.getFluid(100))
                .outputFluids(CTNHMaterials.VibrantAlloy.getFluid(400))
                .chancedOutput(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaPlus, 2), 4000, 2000)
                .chancedOutput(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus), 4000, 2000)
                .chancedOutput(ChemicalHelper.get(TagPrefix.dustSmall, CTNHMaterials.ManaSuperPlus,3), 6000, 2000)
                .EUt(GTValues.V[GTValues.LuV])
                .duration(200)
                .save(provider);

        GTRecipeTypes.CENTRIFUGE_RECIPES.recipeBuilder("mana_up_fuel_exhausted_recycle_2")
                .inputFluids(CTNHMaterials.StarlightFuelExhausted, 1000)
                .outputFluids(CTNHMaterials.BloodFuel.getFluid(100))
                .outputFluids(CTNHMaterials.StarlightFuel.getFluid(100))
                .outputFluids(CTNHMaterials.Zenith_essence.getFluid(1000))
                .chancedOutput(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah,2), 6000, 1000)
                .chancedOutput(ChemicalHelper.get(TagPrefix.dust, NuclearMaterials.Thorium232,4), 4000, 2000)
                .EUt(GTValues.V[GTValues.ZPM])
                .duration(200)
                .save(provider);
        //恒星燃料
        MANAREACTOR.recipeBuilder("star_fuel_1")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus,8))
                .chancedInput(BotaniaFlowerBlocks.marimorphosis.asItem().getDefaultInstance(), 4000, -1250)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah,4 ))
                .inputFluids(CTNHMaterials.StellarAlloy, 288)
                .inputFluids(CTNHMaterials.MelodicAlloy, 288)
                .inputFluids(CTNHMaterials.EndSteel, 288)
                .outputFluids(CTNHMaterials.StarFuel.getFluid(576))
                .EUt(GTValues.V[GTValues.ZPM])
                .duration(200)
                .save(provider);
                
        MAGIC_FUEL_GENERATOR.recipeBuilder("star_fuel_2")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.ManaSuperPlus,8))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah,4 ))
                .inputFluids(CTNHMaterials.StellarAlloy, 288)
                .inputFluids(CTNHMaterials.MelodicAlloy, 288)
                .inputFluids(CTNHMaterials.EndSteel, 288)
                .outputFluids(CTNHMaterials.StarFuel.getFluid(576))
                .EUt(GTValues.V[GTValues.ZPM])
                .duration(100)
                .save(provider);

        MANAREACTOR.recipeBuilder("star_fuel_active_1")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana,32))
                .chancedInput(BotaniaFlowerBlocks.marimorphosis.asItem().getDefaultInstance(), 4000, -1250)
                .inputItems(GTBlocks.INDUSTRIAL_TNT,64)
                .inputFluids(CTNHMaterials.StarFuel, 1152)
                .inputFluids(CTNHMaterials.Adamantite.getFluid(PLASMA,1024))
                .inputFluids(CTNHMaterials.TaraniumPowder, 1024)
                .outputFluids(CTNHMaterials.StarFuelActive.getFluid(1728))
                .EUt(GTValues.V[GTValues.ZPM] * 2)
                .duration(800)
                .save(provider);

        MAGIC_FUEL_GENERATOR.recipeBuilder("star_fuel_active_2")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana,32))
                .inputItems(GTBlocks.INDUSTRIAL_TNT,64)
                .inputFluids(CTNHMaterials.StarFuel, 2304)
                .inputFluids(CTNHMaterials.Adamantite.getFluid(PLASMA,2048))
                .inputFluids(CTNHMaterials.TaraniumPowder, 2048)
                .outputFluids(CTNHMaterials.StarFuelActive.getFluid(3456))
                .EUt(GTValues.V[GTValues.UV])
                .duration(800)
                .save(provider);

                
    }
}
