package io.github.cpearl0.ctnhcore.data.recipe.mana;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.api.recipe.ingredient.FluidIngredient;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import static dev.shadowsoffire.apotheosis.ench.Ench.Items.INFUSED_BREATH;

import dev.shadowsoffire.apotheosis.ench.Ench;
import io.github.cpearl0.ctnhcore.data.materials.ManaMaterials;
import io.github.cpearl0.ctnhcore.registry.*;
import io.github.cpearl0.ctnhcore.registry.machines.multiblock.MultiblocksB;
import io.github.cpearl0.ctnhcore.registry.nuclear.NuclearMaterials;
import mythicbotany.register.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys.PLASMA;
import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;
import com.gregtechceu.gtceu.api.recipe.ResearchRecipeBuilder.*;
import net.minecraft.world.item.Items;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;
import wayoftime.bloodmagic.common.block.BloodMagicBlocks;
import wayoftime.bloodmagic.common.fluid.BloodMagicFluids;
import wayoftime.bloodmagic.common.item.BloodMagicItems;
import com.hollingsworth.arsnouveau.common.lib.LibBlockNames;

public class ManaBeamRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        GTRecipeTypes.ASSEMBLY_LINE_RECIPES.recipeBuilder("beams")
                .inputItems(CTNHManaItems.ZENITH_STAR,32)
                .inputItems(CustomTags.UV_CIRCUITS,32)
                .inputItems(ChemicalHelper.get(TagPrefix.frameGt, CTNHMaterials.UltraMana, 64))
                .inputItems(GTBlocks.SUPERCONDUCTING_COIL,32)
                .inputItems(CTNHManaItems.MANA_CIRCUIT_BOARD,64)
                .inputItems(CTNHBlocks.COIL_ULTRA_MANA,8)
                .inputItems(ChemicalHelper.get(TagPrefix.cableGtQuadruple, CTNHMaterials.UltraMana, 64))
                .inputItems(ChemicalHelper.get(TagPrefix.block, GTMaterials.EnderPearl,64))
                .inputItems(CTNHManaItems.STARLIGHT_RUNE,8)
                .inputItems(CTNHManaItems.TWIST_RUNE,4)
                .inputItems(CTNHManaItems.HORIZEN_RUNE,8)
                .inputItems(CTNHManaItems.QUASAR_RUNE)
                .inputItems(GTBlocks.HIGH_POWER_CASING,32)
                .inputFluids(CTNHMaterials.Zenith_essence, 14400)
                .inputFluids(CTNHMaterials.ManaRadiationMixture, 144000)
                .inputFluids(FluidIngredient.of(BloodMagicFluids.LIFE_ESSENCE_FLUID.get(), 144000))
                .inputFluids(GTMaterials.NaquadahEnriched, 1440)
                .outputItems(MultiblocksB.NICOLL_DYSON_BEAMS)
                .stationResearch(b -> b.researchStack(CTNHManaItems.ZENITH_STAR.asStack()).CWUt(32).EUt(VA[ZPM]))
                .EUt(GTValues.V[GTValues.UV])
                .duration(1000)
                .save(provider);

        BEAMS.recipeBuilder("iron_1")
                .inputItems(Items.IRON_INGOT,512)
                .circuitMeta(1)
                .addData("required_mana", 100000)
                .addData("mana", 10000)
                .outputItems(BotaniaItems.manaSteel,512)
                .duration(50)
                .save(provider);

        BEAMS.recipeBuilder("iron_2")
                .inputItems(Items.IRON_INGOT,512)
                .circuitMeta(2)
                .addData("required_mana", 500000)
                .addData("mana", 100000)
                .outputItems(BotaniaItems.elementium,512)
                .duration(100)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("iron_3")
                .inputItems(Items.IRON_INGOT,512)
                .circuitMeta(3)
                .addData("required_mana", 1000000)
                .addData("mana", 500000)
                .outputItems(ModItems.alfsteelIngot,512)
                .duration(200)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("eve")
                .inputItems(CTNHManaItems.TWIST_RUNE,8)
                .addData("required_mana", 5000000)
                .addData("mana", 2000000)
                .inputFluids(CTNHMaterials.ManaRadiationMixture, 1000000)
                .outputFluids(CTNHMaterials.EVE.getFluid(PLASMA,100000))
                .duration(200)
                .EUt(200000)
                .save(provider);

        BEAMS.recipeBuilder("nq_1")
                .inputItems(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Naquadah,128))
                .addData("required_mana", 5000000)
                .addData("mana", 1000000)
                .inputFluids(CTNHMaterials.EVE.getFluid(PLASMA,1000))
                .outputItems(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Naquadria,64))
                .duration(200)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("nq_2")
                .inputItems(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Naquadah,640))
                .addData("required_mana", 5000000)
                .addData("mana", 1000000)
                .inputFluids(CTNHMaterials.EVE.getFluid(PLASMA,1000))
                .outputItems(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.NaquadahEnriched,480))
                .duration(200)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("placeholder")
                .inputItems(BotaniaItems.placeholder,1024)
                .outputItems(BotaniaItems.runeMana,1024)
                .addData("required_mana", 500000)
                .addData("mana", 100000)
                .duration(200)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("mana_1")
                .inputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.ManaPlus,64))
                .addData("required_mana", 2000000)
                .addData("mana", 1000000)
                .outputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.ManaSuperPlus,64))
                .circuitMeta(1)
                .duration(200)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("mana_2")
                .inputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.ManaPlus,64))
                .addData("required_mana", 5000000)
                .addData("mana", 4000000)
                .inputFluids(CTNHMaterials.ManaRadiationMixture, 10000)
                .outputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.UltraMana,64))
                .duration(200)
                .EUt(10000)
                .save(provider);

        BEAMS.recipeBuilder("mana_3")
                .inputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.ManaPlus,128))
                .addData("required_mana", 10000000)
                .addData("mana", 5000000)
                .inputFluids(CTNHMaterials.EVE.getFluid(PLASMA,10000))
                .outputItems(ChemicalHelper.get(TagPrefix.ingot, CTNHMaterials.UltraMana,128))
                .duration(500)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("rune10")
                .inputItems(BotaniaBlocks.livingrock,1024)
                .addData("required_mana", 500000)
                .addData("mana", 100000)
                .outputItems(BloodMagicItems.SLATE,1024)
                .duration(200)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("rune20")
                .inputItems(BloodMagicItems.SLATE,1024)
                .addData("required_mana", 500000)
                .addData("mana", 200000)
                .outputItems(BloodMagicItems.REINFORCED_SLATE,1024)
                .duration(200)
                .EUt(1)
                .save(provider);

        BEAMS.recipeBuilder("rune30")
                .inputItems(BloodMagicItems.REINFORCED_SLATE,1024)
                .addData("required_mana", 750000)
                .addData("mana", 400000)
                .outputItems(BloodMagicItems.IMBUED_SLATE,1024)
                .duration(200)
                .EUt(1960)
                .save(provider);

        BEAMS.recipeBuilder("rune40")
                .inputItems(BloodMagicItems.IMBUED_SLATE,512)
                .addData("required_mana", 1000000)
                .addData("mana", 500000)
                .outputItems(BloodMagicItems.DEMONIC_SLATE,512)
                .duration(400)
                .EUt(19600)
                .save(provider);

        BEAMS.recipeBuilder("rune5")
                .inputItems(BloodMagicItems.DEMONIC_SLATE,256)
                .addData("required_mana", 1250000)
                .addData("mana", 500000)
                .outputItems(BloodMagicItems.ETHEREAL_SLATE,256)
                .duration(400)
                .EUt(7680)
                .save(provider);

        BEAMS.recipeBuilder("rune6")
                .inputItems(BloodMagicItems.ETHEREAL_SLATE,128)
                .addData("required_mana", 2500000)
                .addData("mana", 1000000)
                .outputItems(CTNHManaItems.ENDSLATE,128)
                .duration(1000)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("nq_up1")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.NaquadahOxideMixture, 1280))
                .addData("required_mana", 1000000)
                .addData("mana", 500000)
                .outputFluids(GTMaterials.Naquadah.getFluid(172800))
                .duration(180)
                .EUt(100000)
                .save(provider);

        BEAMS.recipeBuilder("nq_up2")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.EnrichedNaquadahOxideMixture, 1680))
                .addData("required_mana", 3000000)
                .addData("mana", 2000000)
                .outputFluids(GTMaterials.NaquadahEnriched.getFluid(172800))
                .duration(180)
                .EUt(400000)
                .save(provider);

        BEAMS.recipeBuilder("nq_up3")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.NaquadahOxideMixture, 1280))
                .addData("required_mana", 5000000)
                .addData("mana", 4000000)
                .outputFluids(GTMaterials.Naquadria.getFluid(115200))
                .duration(400)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("amethyst_cluster")
                .inputItems(Items.AMETHYST_SHARD,1280)
                .notConsumable(CTNHManaItems.ENDSLATE)
                .outputItems(BloodMagicItems.RAW_CRYSTAL,640)
                .addData("required_mana", 5000000)
                .addData("mana", 2000000)
                .duration(20)
                .EUt(100000)
                .save(provider);

        BEAMS.recipeBuilder("adamantite_dust")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.Adamantite, 128))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.TaraniumPowder, 128))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 128))
                .inputFluids(CTNHMaterials.StarFuel,50000)
                .outputFluids(CTNHMaterials.StarFuelActive.getFluid(90000))
                .addData("required_mana", 15000000)
                .addData("mana", 10000000)
                .duration(400)
                .EUt(1000000)
                .save(provider);

        BEAMS.recipeBuilder("weakbloodshard")
                .inputItems(BloodMagicItems.STRONG_TAU_ITEM,256)
                .outputItems(BloodMagicItems.WEAK_BLOOD_SHARD,512)
                .addData("required_mana", 2000000)
                .addData("mana", 1000000)
                .duration(200)
                .EUt(10000)
                .save(provider);

        BEAMS.recipeBuilder("mana_circuit_board")
                .outputItems(CTNHManaItems.MANA_CIRCUIT_BOARD,256)
                .inputItems(ChemicalHelper.get(TagPrefix.plate, GTMaterials.ReinforcedEpoxyResin, 256))
                .inputItems(ChemicalHelper.get(TagPrefix.foil, CTNHMaterials.UltraMana, 256))
                .inputFluids(CTNHMaterials.Zenith_essence,16000)
                .addData("required_mana", 5000000)
                .addData("mana", 1000000)
                .duration(200)
                .EUt(40000)
                .save(provider);

        BEAMS.recipeBuilder("agn_fuel_active_plasma_endless")
                .outputFluids(CTNHMaterials.AgnFuelActive.getFluid(PLASMA,100))
                .inputFluids(CTNHMaterials.AgnFuel.getFluid(PLASMA,1000))
                .inputItems(MultiblocksB.EYE_OF_QUASAR)
                .addData("required_mana", 500000000)
                .addData("mana", 100000000)
                .duration(2000)
                .EUt(40000000)
                .save(provider);

        BEAMS.recipeBuilder("mana_radiation_mixture")
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Thorium, 300))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Uranium235, 300))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Plutonium241, 300))
                .inputItems(ChemicalHelper.get(TagPrefix.dust, GTMaterials.Naquadah, 300))
                .inputFluids(CTNHMaterials.Zenith_essence,30000)
                .outputFluids(CTNHMaterials.ManaRadiationMixture    .getFluid(400000))
                .EUt(55555)
                .addData("required_mana", 5000000)
                .addData("mana", 5000000)
                .duration(400)
                .save(provider);

        BEAMS.recipeBuilder("zenith")
                .inputItems(INFUSED_BREATH,100)
                .inputItems(LibBlockNames.SOURCE_GEM_BLOCK,100)
                .inputFluids(CTNHMaterials.Mana, 10000)
                .outputFluids(CTNHMaterials.Zenith_essence.getFluid(300000))
                .duration(400)
                .addData("required_mana", 5000000)
                .addData("mana", 1000000)
                .EUt(66666)
                .save(provider);

        BEAMS.recipeBuilder("umlhpic_wafer")
                .outputItems(CTNHManaItems.UMLHPIC_WAFER,320)
                .inputItems(GTItems.ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT_WAFER,320)
                .inputItems(CTNHManaItems.TWIST_RUNE,10)
                .inputItems(ChemicalHelper.get(TagPrefix.dust, CTNHMaterials.UltraMana, 100))
                .inputFluids(CTNHMaterials.Zenith_essence, 40000)
                .addData("required_mana", 10000000)
                .addData("mana", 5000000)
                .EUt(32678 * 8)
                .duration(400)
                .save(provider);
    }
}