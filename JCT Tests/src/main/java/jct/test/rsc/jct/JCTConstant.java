/**
 * @author Mathieu Lemoine
 * @created 2009-03-23
 *
 * Licensed under 3-clause BSD License:
 * Copyright © 2009, Mathieu Lemoine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of Mathieu Lemoine nor the
 *    names of contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY Mathieu Lemoine ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL Mathieu Lemoine BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jct.test.rsc.jct;

import java.util.Arrays;

import jct.test.rsc.Constant;

public final class JCTConstant {
	public static final String libPath = "lib/";

	public static final String SER_FILE = "jct/test/rsc/jct/JCT.ser";

	public static final Iterable<String> options = Arrays
			.asList(new String[] { "-classpath",
					System.getenv("CLASSPATH") + ":" + JCTConstant.libPath
							+ "javac.jar:" + Constant.SRC_PATH,
					"-d", Constant.TMP_PATH, "-source", "6" });

	public static final String files[] = new String[] {
			"jct/test/rsc/jct/kernel/IJCTMethod.java",
			"jct/test/rsc/jct/kernel/IJCTRemainderAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTUnaryPlus.java",
			"jct/test/rsc/jct/kernel/IJCTMultiply.java",
			"jct/test/rsc/jct/kernel/IJCTEqualTo.java",
			"jct/test/rsc/jct/kernel/IJCTDivide.java",
			"jct/test/rsc/jct/kernel/IJCTGreaterThan.java",
			"jct/test/rsc/jct/kernel/IJCTBlock.java",
			"jct/test/rsc/jct/kernel/Constants.java",
			"jct/test/rsc/jct/kernel/IJCTOrAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTLabel.java",
			"jct/test/rsc/jct/kernel/IJCTGreaterThanOrEqual.java",
			"jct/test/rsc/jct/kernel/IJCTLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTAndAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTPrefixDecrement.java",
			"jct/test/rsc/jct/kernel/IJCTMinusAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTVisitor.java",
			"jct/test/rsc/jct/kernel/IJCTPlus.java",
			"jct/test/rsc/jct/kernel/IJCTType.java",
			"jct/test/rsc/jct/kernel/IJCTNotEqualTo.java",
			"jct/test/rsc/jct/kernel/IJCTThrow.java",
			"jct/test/rsc/jct/kernel/IJCTLeftShiftAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTCompilationUnit.java",
			"jct/test/rsc/jct/kernel/IJCTVariable.java",
			"jct/test/rsc/jct/kernel/IJCTUnsignedRightShift.java",
			"jct/test/rsc/jct/kernel/IJCTComment.java",
			"jct/test/rsc/jct/kernel/IJCTRemainder.java",
			"jct/test/rsc/jct/kernel/IJCTIf.java",
			"jct/test/rsc/jct/kernel/IJCTUnsignedRightShiftAssignment.java",
			"jct/test/rsc/jct/kernel/package-info.java",
			"jct/test/rsc/jct/kernel/IJCTLessThan.java",
			"jct/test/rsc/jct/kernel/JCTKind.java",
			"jct/test/rsc/jct/kernel/IJCTPrimitiveType.java",
			"jct/test/rsc/jct/kernel/IJCTPostfixDecrement.java",
			"jct/test/rsc/jct/kernel/IJCTBreak.java",
			"jct/test/rsc/jct/kernel/IJCTRootNode.java",
			"jct/test/rsc/jct/kernel/IJCTElementContainer.java",
			"jct/test/rsc/jct/kernel/IJCTImportable.java",
			"jct/test/rsc/jct/kernel/IJCTFloatLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTContinue.java",
			"jct/test/rsc/jct/kernel/IJCTParenthesis.java",
			"jct/test/rsc/jct/kernel/IJCTBitwiseComplement.java",
			"jct/test/rsc/jct/kernel/IJCTNewClass.java",
			"jct/test/rsc/jct/kernel/IJCTArrayType.java",
			"jct/test/rsc/jct/kernel/IJCTPostfixIncrement.java",
			"jct/test/rsc/jct/kernel/IJCTParameter.java",
			"jct/test/rsc/jct/kernel/IJCTOr.java",
			"jct/test/rsc/jct/kernel/IJCTMultiplyAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTBinaryOperator.java",
			"jct/test/rsc/jct/kernel/IJCTSynchronized.java",
			"jct/test/rsc/jct/kernel/IJCTSimpleSelector.java",
			"jct/test/rsc/jct/kernel/IJCTWhile.java",
			"jct/test/rsc/jct/kernel/impl/JCTPostfixedUnaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTDoubleLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTAnd.java",
			"jct/test/rsc/jct/kernel/impl/JCTClassMember.java",
			"jct/test/rsc/jct/kernel/impl/JCTLeftShift.java",
			"jct/test/rsc/jct/kernel/impl/JCTCast.java",
			"jct/test/rsc/jct/kernel/impl/JCTStringLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTDoWhile.java",
			"jct/test/rsc/jct/kernel/impl/JCTIntersectionType.java",
			"jct/test/rsc/jct/kernel/impl/JCTFor.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnaryMinus.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnaryPlus.java",
			"jct/test/rsc/jct/kernel/impl/JCTClassType.java",
			"jct/test/rsc/jct/kernel/impl/JCTRenamedRootNode.java",
			"jct/test/rsc/jct/kernel/impl/JCTPrimitiveType.java",
			"jct/test/rsc/jct/kernel/impl/JCTReturn.java",
			"jct/test/rsc/jct/kernel/impl/JCTSelector.java",
			"jct/test/rsc/jct/kernel/impl/JCTLongLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTPathPartBuilder.java",
			"jct/test/rsc/jct/kernel/impl/JCTErroneousExpression.java",
			"jct/test/rsc/jct/kernel/impl/JCTVariable.java",
			"jct/test/rsc/jct/kernel/impl/package-info.java",
			"jct/test/rsc/jct/kernel/impl/JCTType.java",
			"jct/test/rsc/jct/kernel/impl/JCTNewArray.java",
			"jct/test/rsc/jct/kernel/impl/JCTEnhancedFor.java",
			"jct/test/rsc/jct/kernel/impl/JCTGreaterThan.java",
			"jct/test/rsc/jct/kernel/impl/JCTBreakContinue.java",
			"jct/test/rsc/jct/kernel/impl/JCTOrAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTClass.java",
			"jct/test/rsc/jct/kernel/impl/JCTRemainder.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnsignedRightShiftAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTLabel.java",
			"jct/test/rsc/jct/kernel/impl/JCTPath.java",
			"jct/test/rsc/jct/kernel/impl/JCTContinue.java",
			"jct/test/rsc/jct/kernel/impl/JCTNullLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTPrefixedUnaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTDoWhileImpl.java",
			"jct/test/rsc/jct/kernel/impl/JCTLessThan.java",
			"jct/test/rsc/jct/kernel/impl/JCTMultiply.java",
			"jct/test/rsc/jct/kernel/impl/JCTField.java",
			"jct/test/rsc/jct/kernel/impl/JCTImport.java",
			"jct/test/rsc/jct/kernel/impl/JCTPlusAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTComment.java",
			"jct/test/rsc/jct/kernel/impl/JCTCatch.java",
			"jct/test/rsc/jct/kernel/impl/JCTSynchronized.java",
			// "jct/test/rsc/jct/kernel/impl/JCTElement.java",
			"jct/test/rsc/jct/kernel/impl/JCTSwitch.java",
			"jct/test/rsc/jct/kernel/impl/JCTMinus.java",
			"jct/test/rsc/jct/kernel/impl/JCTWhile.java",
			"jct/test/rsc/jct/kernel/impl/JCTFileOffsetPath.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnresolvedSimpleSelector.java",
			"jct/test/rsc/jct/kernel/impl/JCTElementContainer.java",
			"jct/test/rsc/jct/kernel/impl/JCTMultiplyAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTSourceCodePart.java",
			"jct/test/rsc/jct/kernel/impl/JCTIf.java",
			"jct/test/rsc/jct/kernel/impl/JCTTry.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnsignedRightShift.java",
			"jct/test/rsc/jct/kernel/impl/JCTAssert.java",
			"jct/test/rsc/jct/kernel/impl/JCTMethodInvocation.java",
			"jct/test/rsc/jct/kernel/impl/JCTIntegerLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTArrayType.java",
			"jct/test/rsc/jct/kernel/impl/JCTNonPrimitiveType.java",
			"jct/test/rsc/jct/kernel/impl/JCTLeftShiftAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTXorAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTPostfixDecrement.java",
			"jct/test/rsc/jct/kernel/impl/JCTPrefixIncrement.java",
			"jct/test/rsc/jct/kernel/impl/JCTBinaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTPathPart.java",
			"jct/test/rsc/jct/kernel/impl/JCTRightShiftAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTParenthesis.java",
			"jct/test/rsc/jct/kernel/impl/JCTOr.java",
			"jct/test/rsc/jct/kernel/impl/JCTXor.java",
			"jct/test/rsc/jct/kernel/impl/JCTBooleanLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTBitwiseComplement.java",
			"jct/test/rsc/jct/kernel/impl/JCTLogicalComplement.java",
			"jct/test/rsc/jct/kernel/impl/JCTPrefixDecrement.java",
			"jct/test/rsc/jct/kernel/impl/JCTRemainderAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTPlus.java",
			"jct/test/rsc/jct/kernel/impl/JCTConditionalOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTGreaterThanOrEqual.java",
			"jct/test/rsc/jct/kernel/impl/JCTLogicalBinaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTRightShift.java",
			"jct/test/rsc/jct/kernel/impl/JCTCase.java",
			"jct/test/rsc/jct/kernel/impl/JCTVariableImpl.java",
			"jct/test/rsc/jct/kernel/impl/JCTPackage.java",
			"jct/test/rsc/jct/kernel/impl/JCTBreak.java",
			"jct/test/rsc/jct/kernel/impl/JCTCompilationUnit.java",
			"jct/test/rsc/jct/kernel/impl/JCTDivide.java",
			"jct/test/rsc/jct/kernel/impl/JCTBlock.java",
			"jct/test/rsc/jct/kernel/impl/JCTConditionalOr.java",
			"jct/test/rsc/jct/kernel/impl/JCTErroneousSelector.java",
			"jct/test/rsc/jct/kernel/impl/JCTArrayAccess.java",
			"jct/test/rsc/jct/kernel/impl/JCTMethod.java",
			"jct/test/rsc/jct/kernel/impl/JCTArithmeticBinaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTRootNode.java",
			"jct/test/rsc/jct/kernel/impl/JCTExpressionStatement.java",
			"jct/test/rsc/jct/kernel/impl/JCTEqualTo.java",
			"jct/test/rsc/jct/kernel/impl/JCTPostfixIncrement.java",
			"jct/test/rsc/jct/kernel/impl/JCTSimpleSelector.java",
			"jct/test/rsc/jct/kernel/impl/JCTFactory.java",
			"jct/test/rsc/jct/kernel/impl/JCTAndAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTCharacterLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTMinusAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTNewClass.java",
			"jct/test/rsc/jct/kernel/impl/JCTParameter.java",
			"jct/test/rsc/jct/kernel/impl/JCTDivideAssignment.java",
			"jct/test/rsc/jct/kernel/impl/JCTNotEqualTo.java",
			"jct/test/rsc/jct/kernel/impl/JCTUnaryOperator.java",
			"jct/test/rsc/jct/kernel/impl/JCTFloatLiteral.java",
			"jct/test/rsc/jct/kernel/impl/JCTLessThanOrEqual.java",
			"jct/test/rsc/jct/kernel/impl/JCTEmptyStatement.java",
			"jct/test/rsc/jct/kernel/impl/JCTConditionalAnd.java",
			"jct/test/rsc/jct/kernel/impl/JCTThrow.java",
			"jct/test/rsc/jct/kernel/impl/JCTMemberSelector.java",
			"jct/test/rsc/jct/kernel/impl/JCTInstanceOf.java",
			"jct/test/rsc/jct/kernel/IJCTNullLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTPlusAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTCharacterLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTNonPrimitiveType.java",
			"jct/test/rsc/jct/kernel/IJCTFor.java",
			"jct/test/rsc/jct/kernel/IJCTLeftShift.java",
			"jct/test/rsc/jct/kernel/IJCTElement.java",
			"jct/test/rsc/jct/kernel/IJCTEnhancedFor.java",
			"jct/test/rsc/jct/kernel/IJCTErroneousSelector.java",
			"jct/test/rsc/jct/kernel/IJCTIntersectionType.java",
			"jct/test/rsc/jct/kernel/IJCTStringLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTConditionalAnd.java",
			"jct/test/rsc/jct/kernel/IJCTIntegerLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTPackage.java",
			"jct/test/rsc/jct/kernel/IJCTCase.java",
			"jct/test/rsc/jct/kernel/IJCTSwitch.java",
			"jct/test/rsc/jct/kernel/IJCTAssignment.java",
			"jct/test/rsc/jct/kernel/JCTPrimitiveTypes.java",
			"jct/test/rsc/jct/kernel/IJCTUnaryOperator.java",
			"jct/test/rsc/jct/kernel/IJCTPathPart.java",
			"jct/test/rsc/jct/kernel/IJCTCatch.java",
			"jct/test/rsc/jct/kernel/IJCTTry.java",
			"jct/test/rsc/jct/kernel/IJCTLongLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTExpression.java",
			"jct/test/rsc/jct/kernel/IJCTLessThanOrEqual.java",
			"jct/test/rsc/jct/kernel/IJCTConditionalOr.java",
			"jct/test/rsc/jct/kernel/IJCTExpressionStatement.java",
			"jct/test/rsc/jct/kernel/IJCTPath.java",
			"jct/test/rsc/jct/kernel/IJCTReturn.java",
			"jct/test/rsc/jct/kernel/IJCTField.java",
			"jct/test/rsc/jct/kernel/IJCTClassType.java",
			"jct/test/rsc/jct/kernel/IJCTArrayAccess.java",
			"jct/test/rsc/jct/kernel/IJCTClassMember.java",
			"jct/test/rsc/jct/kernel/IJCTXor.java",
			"jct/test/rsc/jct/kernel/IJCTLogicalComplement.java",
			"jct/test/rsc/jct/kernel/IJCTNewArray.java",
			"jct/test/rsc/jct/kernel/IJCTSelector.java",
			"jct/test/rsc/jct/kernel/IJCTSourceCodePart.java",
			"jct/test/rsc/jct/kernel/IJCTDoWhile.java",
			"jct/test/rsc/jct/kernel/IJCTConditionalOperator.java",
			"jct/test/rsc/jct/kernel/IJCTDivideAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTDoubleLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTFactory.java",
			"jct/test/rsc/jct/kernel/IJCTXorAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTMemberSelector.java",
			"jct/test/rsc/jct/kernel/IJCTErroneousExpression.java",
			"jct/test/rsc/jct/kernel/JCTModifiers.java",
			"jct/test/rsc/jct/kernel/IJCTRightShift.java",
			"jct/test/rsc/jct/kernel/IJCTStatement.java",
			"jct/test/rsc/jct/kernel/IJCTUnaryMinus.java",
			"jct/test/rsc/jct/kernel/IJCTEmptyStatement.java",
			"jct/test/rsc/jct/kernel/IJCTMethodInvocation.java",
			"jct/test/rsc/jct/kernel/IJCTIdentifiable.java",
			"jct/test/rsc/jct/kernel/IJCTMinus.java",
			"jct/test/rsc/jct/kernel/IJCTBooleanLiteral.java",
			"jct/test/rsc/jct/kernel/IJCTCast.java",
			"jct/test/rsc/jct/kernel/IJCTClass.java",
			"jct/test/rsc/jct/kernel/IJCTRightShiftAssignment.java",
			"jct/test/rsc/jct/kernel/IJCTPrefixIncrement.java",
			"jct/test/rsc/jct/kernel/IJCTImport.java",
			"jct/test/rsc/jct/kernel/IJCTAnd.java",
			"jct/test/rsc/jct/kernel/IJCTInstanceOf.java",
			"jct/test/rsc/jct/kernel/IJCTAssert.java",
			"jct/test/rsc/jct/util/reference/NullableReference.java",
			"jct/test/rsc/jct/util/reference/StrongReference.java",
			"jct/test/rsc/jct/util/reference/NotNullableReference.java",
			"jct/test/rsc/jct/util/misc/Counter.java",
			"jct/test/rsc/jct/util/ListOfElements.java",
			"jct/test/rsc/jct/util/collection/ListOfUnique.java",
			"jct/test/rsc/jct/util/collection/IndirectCollection.java",
			"jct/test/rsc/jct/util/AbstractJCTContainer.java",
			"jct/test/rsc/jct/util/equiv/ComparatorEquivalence.java",
			"jct/test/rsc/jct/util/equiv/Identity.java",
			"jct/test/rsc/jct/util/equiv/Equivalence.java",
			"jct/test/rsc/jct/util/equiv/ComparableEquivalence.java",
			"jct/test/rsc/jct/util/equiv/NaturalEquivalence.java",
			"jct/test/rsc/jct/util/IJCTContainer.java", };
}
