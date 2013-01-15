/*
 * The MIT License
 *
 * Copyright 2013 Cameron Garnham.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.multibit.viewsystem.core;

import javax.swing.Icon;

/**
 *
 * @author Cameron Garnham
 */
public interface View {
    public static final int SAME_VIEW = -1; // Not a real view - used to forward to the same view as calling
    public static final int UNKNOWN_VIEW = 0;
    public static final int WELCOME_VIEW = 1;
    public static final int HELP_CONTENTS_VIEW = 2;
    public static final int HELP_ABOUT_VIEW = 3;
    public static final int PREFERENCES_VIEW = 4; 
    
    public static final int DEFAULT_VIEW = WELCOME_VIEW;

    /**
     * display the view
     */
    void displayView();

    /**
     * @returns the icon for the view
     */
    Icon getViewIcon();

    /**
     * @returns the view identifier for the view
     */
    int getViewId();

    /**
     * @returns the title for the view
     */
    String getViewTitle();

    /**
     * @returns the tooltip for the view
     */
    String getViewTooltip();

    /**
     * Navigate away from the view (including releasing any resources used)
     */
    void navigateAwayFromView();
    
}
