import greenfoot.*;

/**
 * Dialogue class specific to the Mermaid dialogue.
 */
public class Dialogue4Mermaid extends DialogueBox {
    
    // Constructor to initialize the dialogue lines and speakers
    public Dialogue4Mermaid() {
        // Initializing dialogue lines
        lines = new String[] {
            "The witch said you know where the princess is. I need you to tell me.",
            "Not so fast. You’ll need my Celestial Pearl before you face her.",
            "Alright… what can I do to earn it?",
            "Time isn’t just looping. It’s forgetting us. This kingdom is slowly fading—\npiece by piece. Until this kingdom is no more.",
            "My loved one, they’re nearly gone. All that’s left of them are their voices,\nechoing inside these shells",
            "Even the Celestial Pearl is dimming. And once it fades completely... there's\nno bringing it back.",
            "That’s awful… all this just because the heir didn’t want to be cursed?",
            "...The heir got cursed? Right. It is so well placed coming from you.",
            "I mean— how do you know that I don’t even remember who I am. Am I being\nforgotten too?",
            "That’s not what I meant… you do not remember anything? That is strange…\nbut no. You’re not like the rest.",
            "How can you be so sure?",
            "We’re running out of time. Help me—let their voices be heard again, just for a\nmoment. It will breathe life back into the Pearl, just long enough for you to\ntake it.",
            "Why do I even need this artifact?",
            "You ask too many questions. Listen to the shells. Let their voices fill the\nsilence. Only then can you resist the pull of forgetfulness… and finish what\nyou came here to do."
        };

        // Initializing speaker names
        speakers = new String[] {
            "Player", "Mermaid", "Player", "Mermaid", "Mermaid", "Mermaid", "Player", "Mermaid",
            "Player", "Mermaid", "Player", "Mermaid", "Player", "Mermaid"
        };

        updateDisplay();  // Call to update the dialogue display (assuming you have that method)
    }

    /**
     * This method is triggered when the dialogue reaches the end.
     * It changes the world to the next one (MeetMermaid2).
     */
    @Override
    protected void onDialogueEnd() {
        Greenfoot.setWorld(new MeetMermaid2());  // Transition to the new world
    }
}
