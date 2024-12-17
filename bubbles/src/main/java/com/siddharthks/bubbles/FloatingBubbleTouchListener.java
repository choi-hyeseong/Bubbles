package com.siddharthks.bubbles;

public interface FloatingBubbleTouchListener {

    void onDown(float x, float y);

    void onTap(boolean expanded);

    void onRemove();

    void onMove(float x, float y);

    void onUp(float x, float y);

    /**
     *
     * @param removeLambda for remove Fun
     * @return Default Touch Listener
     */
    static FloatingBubbleTouchListener getDefaultTouchListener(Runnable removeLambda) {
        return new FloatingBubbleTouchListener() {

            @Override
            public void onDown(float x, float y) {

            }

            @Override
            public void onTap(boolean expanded) {

            }

            @Override
            public void onRemove() {
                removeLambda.run();
            }

            @Override
            public void onMove(float x, float y) {

            }

            @Override
            public void onUp(float x, float y) {

            }
        };
    }
}