package in.bjorgv.openapi.codegen;

import org.openapitools.codegen.*;
import org.openapitools.codegen.model.*;
import io.swagger.models.properties.*;

import java.util.*;
import java.io.File;

public class SilentJavaGenerator extends DefaultCodegen implements CodegenConfig {

  public SilentJavaGenerator() {
    super();
  }

  // override with any message to be shown right before the process finishes
  @Override
  @SuppressWarnings("static-method")
  public void postProcess() {
    // Silence is golden
  }

  @Override
  public String getName() {
      return "silent-java";
  }
}
