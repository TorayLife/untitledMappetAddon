package toraylife.mappetextras.modules.scripting.scripts.code.triggers;

import mchorse.mappet.api.triggers.blocks.StateTriggerBlock;
import mchorse.mappet.api.utils.TargetMode;
import toraylife.mappetextras.modules.scripting.scripts.code.triggers.utils.ScriptStringTriggerBlock;
import toraylife.mappetextras.modules.scripting.scripts.user.triggers.IScriptStateTriggerBlock;

public class ScriptStateTriggerBlock extends ScriptStringTriggerBlock<StateTriggerBlock> implements IScriptStateTriggerBlock {

    public String getTarget() {
        return this.triggerBlock.target.mode.name();
    }
    public void setTarget(String target) {
        this.triggerBlock.target.mode = TargetMode.valueOf(target.toUpperCase());
    }

    public Object getValue() {
        return this.triggerBlock.value;
    }
    public void setValue(Object value) {
        this.triggerBlock.value = value;
    }

    public String getMode() {
        return this.triggerBlock.mode.name();
    }
    public void setMode(String mode) {
        this.triggerBlock.mode = StateTriggerBlock.StateMode.valueOf(mode.toUpperCase());
    }

    public ScriptStateTriggerBlock() {
        this(new StateTriggerBlock());
    }

    public ScriptStateTriggerBlock(StateTriggerBlock triggerBlock) {
        this.triggerBlock = triggerBlock;
    }
}
