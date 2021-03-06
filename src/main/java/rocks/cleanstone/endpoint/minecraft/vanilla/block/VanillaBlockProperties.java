package rocks.cleanstone.endpoint.minecraft.vanilla.block;

import rocks.cleanstone.game.block.state.property.type.PropertyBoolean;
import rocks.cleanstone.game.block.state.property.type.PropertyEnum;
import rocks.cleanstone.game.block.state.property.type.PropertyInteger;
import rocks.cleanstone.game.block.state.property.vanilla.*;

/**
 * A list of the vanilla block state properties
 * !! GENERATED FILE. This file was generated using the php-converter script. !!
 * */
public class VanillaBlockProperties {
    public static final PropertyBoolean SNOWY = new PropertyBoolean("snowy");
    public static final PropertyInteger STAGE = new PropertyInteger("stage", 0, 1);
    public static final PropertyInteger LEVEL = new PropertyInteger("level", 0, 8);
    public static final PropertyEnum<Axis> AXIS = new PropertyEnum<>("axis", Axis.class);
    public static final PropertyInteger DISTANCE = new PropertyInteger("distance", 1, 7);
    public static final PropertyBoolean PERSISTENT = new PropertyBoolean("persistent");
    public static final PropertyEnum<Facing> FACING = new PropertyEnum<>("facing", Facing.class);
    public static final PropertyBoolean TRIGGERED = new PropertyBoolean("triggered");
    public static final PropertyEnum<Instrument> INSTRUMENT = new PropertyEnum<>("instrument", Instrument.class);
    public static final PropertyInteger NOTE = new PropertyInteger("note", 0, 24);
    public static final PropertyBoolean POWERED = new PropertyBoolean("powered");
    public static final PropertyBoolean OCCUPIED = new PropertyBoolean("occupied");
    public static final PropertyEnum<BedPart> PART = new PropertyEnum<>("part", BedPart.class);
    public static final PropertyEnum<RailShape> SHAPE = new PropertyEnum<>("shape", RailShape.class);
    public static final PropertyBoolean EXTENDED = new PropertyBoolean("extended");
    public static final PropertyEnum<BlockHalf> HALF = new PropertyEnum<>("half", BlockHalf.class);
    public static final PropertyBoolean SHORT = new PropertyBoolean("short");
    public static final PropertyEnum<PistonType> TYPE = new PropertyEnum<>("type", PistonType.class);
    public static final PropertyBoolean UNSTABLE = new PropertyBoolean("unstable");
    public static final PropertyInteger AGE = new PropertyInteger("age", 0, 3);
    public static final PropertyBoolean EAST = new PropertyBoolean("east");
    public static final PropertyBoolean NORTH = new PropertyBoolean("north");
    public static final PropertyBoolean SOUTH = new PropertyBoolean("south");
    public static final PropertyBoolean UP = new PropertyBoolean("up");
    public static final PropertyBoolean WEST = new PropertyBoolean("west");
    public static final PropertyEnum<StairHalf> STAIR_HALF = new PropertyEnum<>("half", StairHalf.class);
    public static final PropertyEnum<StairShape> STAIR_SHAPE = new PropertyEnum<>("shape", StairShape.class);
    public static final PropertyBoolean WATERLOGGED = new PropertyBoolean("waterlogged");
    public static final PropertyEnum<ChestType> CHEST_TYPE = new PropertyEnum<>("type", ChestType.class);
    public static final PropertyEnum<RedstonePosition> REDSTONE_POSITION_EAST = new PropertyEnum<>("east", RedstonePosition.class);
    public static final PropertyEnum<RedstonePosition> REDSTONE_POSITION_NORTH = new PropertyEnum<>("north", RedstonePosition.class);
    public static final PropertyInteger POWER = new PropertyInteger("power", 0, 15);
    public static final PropertyEnum<RedstonePosition> REDSTONE_POSITION_SOUTH = new PropertyEnum<>("south", RedstonePosition.class);
    public static final PropertyEnum<RedstonePosition> REDSTONE_POSITION_WEST = new PropertyEnum<>("west", RedstonePosition.class);
    public static final PropertyInteger MOISTURE = new PropertyInteger("moisture", 0, 7);
    public static final PropertyBoolean LIT = new PropertyBoolean("lit");
    public static final PropertyInteger ROTATION = new PropertyInteger("rotation", 0, 15);
    public static final PropertyEnum<HingePosition> HINGE = new PropertyEnum<>("hinge", HingePosition.class);
    public static final PropertyBoolean OPEN = new PropertyBoolean("open");
    public static final PropertyEnum<Face> FACE = new PropertyEnum<>("face", Face.class);
    public static final PropertyInteger LAYERS = new PropertyInteger("layers", 1, 8);
    public static final PropertyBoolean HAS_RECORD = new PropertyBoolean("has_record");
    public static final PropertyInteger BITES = new PropertyInteger("bites", 0, 6);
    public static final PropertyInteger DELAY = new PropertyInteger("delay", 1, 4);
    public static final PropertyBoolean LOCKED = new PropertyBoolean("locked");
    public static final PropertyEnum<HalfBlockPosition> HALF_BLOCK_POSITION = new PropertyEnum<>("type", HalfBlockPosition.class);
    public static final PropertyBoolean DOWN = new PropertyBoolean("down");
    public static final PropertyBoolean IN_WALL = new PropertyBoolean("in_wall");
    public static final PropertyBoolean HAS_BOTTLE_LEFT = new PropertyBoolean("has_bottle_0");
    public static final PropertyBoolean HAS_BOTTLE_MIDDLE = new PropertyBoolean("has_bottle_1");
    public static final PropertyBoolean HAS_BOTTLE_RIGHT = new PropertyBoolean("has_bottle_2");
    public static final PropertyBoolean EYE = new PropertyBoolean("eye");
    public static final PropertyBoolean ATTACHED = new PropertyBoolean("attached");
    public static final PropertyBoolean DISARMED = new PropertyBoolean("disarmed");
    public static final PropertyBoolean CONDITIONAL = new PropertyBoolean("conditional");
    public static final PropertyEnum<ComparatorMode> COMPARATOR_MODE = new PropertyEnum<>("mode", ComparatorMode.class);
    public static final PropertyBoolean INVERTED = new PropertyBoolean("inverted");
    public static final PropertyBoolean ENABLED = new PropertyBoolean("enabled");
    public static final PropertyInteger EGGS = new PropertyInteger("eggs", 1, 4);
    public static final PropertyInteger HATCH = new PropertyInteger("hatch", 0, 2);
    public static final PropertyInteger PICKLES = new PropertyInteger("pickles", 1, 4);
    public static final PropertyEnum<BambooLeaves> BAMBOO_LEAVES = new PropertyEnum<>("leaves", BambooLeaves.class);
    public static final PropertyBoolean DRAG = new PropertyBoolean("drag");
    public static final PropertyBoolean BOTTOM = new PropertyBoolean("bottom");
    public static final PropertyBoolean HAS_BOOK = new PropertyBoolean("has_book");
    public static final PropertyEnum<BellAttachment> BELL_ATTACHMENT = new PropertyEnum<>("attachment", BellAttachment.class);
    public static final PropertyBoolean HANGING = new PropertyBoolean("hanging");
    public static final PropertyBoolean SIGNAL_FIRE = new PropertyBoolean("signal_fire");
    public static final PropertyEnum<StructureBlockMode> STRUCTURE_BLOCK_MODE = new PropertyEnum<>("mode", StructureBlockMode.class);
}
