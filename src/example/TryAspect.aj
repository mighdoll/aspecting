package example;

public aspect TryAspect {
  after(Object newVal): 
      execution(* Observable+.*_$eq(*)) 
      && args(newVal) {
    String methodName = thisJoinPoint.getSignature().getName();
    String propName = methodName.substring(0, methodName.length() - 4);
    Object target = thisJoinPoint.getTarget();
    Observation.changed(target, propName, newVal);
  }
}

