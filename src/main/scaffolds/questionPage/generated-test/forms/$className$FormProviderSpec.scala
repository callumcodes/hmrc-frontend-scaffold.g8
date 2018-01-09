package forms

import forms.behaviours.FieldBehaviours
import play.api.data.FormError

class $className$FormProviderSpec extends FieldBehaviours {

  val form = new $className$FormProvider()()

  ".field1" must {

    val fieldName = "field1"
    val requiredKey = "$className;format="decap"$.error.field1.required"

    behave like fieldThatBindsValidData(
      form,
      fieldName,
      nonEmptyString
    )

    behave like mandatoryField(
      form,
      fieldName,
      requiredError = FormError(fieldName, requiredKey)
    )
  }

  ".field2" must {

    val fieldName = "field2"
    val requiredKey = "$className;format="decap"$.error.field2.required"

    behave like fieldThatBindsValidData(
      form,
      fieldName,
      nonEmptyString
    )

    behave like mandatoryField(
      form,
      fieldName,
      requiredError = FormError(fieldName, requiredKey)
    )
  }
}
