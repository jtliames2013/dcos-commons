package com.mesosphere.sdk.offer.evaluate.placement;

import com.mesosphere.sdk.config.SerializationUtils;
import com.mesosphere.sdk.testutils.TestConstants;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * This class tests the {@link RegionRule} class.
 */
public class RegionRuleTest {
    @Test
    public void testSerializeDeserialize() throws IOException {
        PlacementRule rule = new RegionRule(ExactMatcher.create(TestConstants.REGION));
        Assert.assertEquals(
                rule,
                SerializationUtils.fromString(
                        SerializationUtils.toJsonString(rule),
                        PlacementRule.class,
                        TestPlacementUtils.OBJECT_MAPPER));
    }
}
