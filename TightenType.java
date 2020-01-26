       // Look for a function type in the argument list.
        Iterator<Node> paramIter =
            ((FunctionType) recvType).getParameters().iterator();
        Iterator<Node> paramIter = n.children().iterator();
        while (paramIter.hasNext() && paramIter.hasNext()) {
          Node arg = paramIter.next();
          Node param = paramIter.next();
          if (arg.getJSType() instanceof FunctionType) {
            actions.addAll(getImplicitActionsFromArgument(
                arg,
                ((FunctionType) arg.getJSType()).getTypeOfThis(),
                param.getJSType()));