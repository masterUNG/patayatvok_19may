package helper;

import android.util.Log;

public class LogCustom {
	
	private static final int STACK_TRACE_LEVELS_UP = 5;

    public static void showLog(String tag, String message)
    {
            Log.v(tag, "LogCustom : "+getClassNameMethodNameAndLineNumber() + message);
    }

    /**
     * Get the current line number. Note, this will only work as called from
     * this class as it has to go a predetermined number of steps up the stack
     * trace. In this case 5.
     * 
     * @author kvarela
     * @return int - Current line number.
     */
    private static int getLineNumber()
    {
	return Thread.currentThread().getStackTrace()[STACK_TRACE_LEVELS_UP].getLineNumber();
    }

    /**
     * Get the current class name. Note, this will only work as called from this
     * class as it has to go a predetermined number of steps up the stack trace.
     * In this case 5.
     * 
     * @author kvarela
     * @return String - Current line number.
     */
    private static String getClassName()
    {
	String fileName = Thread.currentThread().getStackTrace()[STACK_TRACE_LEVELS_UP].getFileName();

	// kvarela: Removing ".java" and returning class name
	return fileName.substring(0, fileName.length() - 5);
    }

    /**
     * Get the current method name. Note, this will only work as called from
     * this class as it has to go a predetermined number of steps up the stack
     * trace. In this case 5.
     * 
     * @author kvarela
     * @return String - Current line number.
     */
    private static String getMethodName()
    {
	return Thread.currentThread().getStackTrace()[STACK_TRACE_LEVELS_UP].getMethodName();
    }

    /**
     * Returns the class name, method name, and line number from the currently
     * executing log call in the form <class_name>.<method_name>()-<line_number>
     * 
     * @author kvarela
     * @return String - String representing class name, method name, and line
     *         number.
     */
    private static String getClassNameMethodNameAndLineNumber()
    {
	return "[" + getClassName() + "." + getMethodName() + "() Line:" + getLineNumber() + "]: ";
    }




}
